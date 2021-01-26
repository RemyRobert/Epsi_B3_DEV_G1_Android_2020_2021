package fr.epsi.testepsi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends EpsiActivity implements View.OnClickListener {

    String urlNature= "https://www.slate.fr/sites/default/files/styles/1060x523/public/lukasz-szmigiel-jfcviyfycus-unsplash.jpg";
    String urlEspace= "https://www.entreprendre.fr/wp-content/uploads/AdobeStock_2015532431.jpg";

    public static void displayActivity(EpsiActivity activity){
        Intent intent = new Intent(activity,HomeActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("Home");
        findViewById(R.id.buttonNature).setOnClickListener(this);
        findViewById(R.id.buttonEspace).setOnClickListener(this);
        findViewById(R.id.buttonStudents).setOnClickListener(this);
        findViewById(R.id.buttonStudentsWS).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonNature:
                ImageActivity.displayActivity(this,urlNature,"Nature");
                break;
            case R.id.buttonEspace:
                ImageActivity.displayActivity(this,urlEspace,"Espace");
                break;
            case R.id.buttonStudents:
                StudentsActivity.displayActivity(this);
                break;
            case R.id.buttonStudentsWS:
                StudentsWSActivity.displayActivity(this);
                break;
        }
    }
}