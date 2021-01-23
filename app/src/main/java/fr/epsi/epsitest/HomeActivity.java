package fr.epsi.epsitest;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends EpsiTestActivity {


    static public void displayActivity(EpsiTestActivity activity){
        Intent intent = new Intent(activity,HomeActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.buttonNature).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.slate.fr/sites/default/files/styles/1060x523/public/lukasz-szmigiel-jfcviyfycus-unsplash.jpg";
                ImageActivity.displayImageActivity(HomeActivity.this,url);
            }
        });

        findViewById(R.id.buttonEspace).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.entreprendre.fr/wp-content/uploads/AdobeStock_2015532431.jpg";
                ImageActivity.displayImageActivity(HomeActivity.this,url);
            }
        });
    }
}