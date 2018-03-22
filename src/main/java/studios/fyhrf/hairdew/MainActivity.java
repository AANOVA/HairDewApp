package studios.fyhrf.hairdew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button Create;
    final Context context = this;
    private Button Explore;
    private Button FAQ;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //This Method Loads the Apps Home page when user clicks on LogIn Button
    public void goToMainLogin(View view){
        button = (Button) findViewById(R.id.login_button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(MainActivity.this, MainLogin.class);
                startActivity(intent);
                finish();

            }

        });

    }
    public void searchViewLogic (View view){
        searchView = (SearchView) findViewById(R.id.search_bar);
    }

    //This method sends user to the Create page when create button is clicked
    //Esta metodo enviar una usar a la pagina de creacion
    public void createButton(View view){
        Create = (Button) findViewById(R.id.button_Create);

        Create.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0){

                Intent intent = new Intent(MainActivity.this, CreateActivity.class);
                startActivity(intent);

            }


        });
    }


    //This method sends user to the Explore page when explore button is clicked
    public void exploreButton(View view){
        Explore = (Button) findViewById(R.id.button_Explore);
        Explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, ExploreActivity.class);
                startActivity(intent);
            }
        });

    }
    //This method sends user to the FAQ page when FAQ button is clicked
    public void fAQButton(View view){
        FAQ = (Button) findViewById(R.id.button_FAQ);
        FAQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, FAQActivity.class);
                startActivity(intent);
            }
        });

    }

}
