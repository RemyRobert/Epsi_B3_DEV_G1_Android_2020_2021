package fr.epsi.epsitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageActivity extends EpsiTestActivity {

    static public void displayImageActivity(EpsiTestActivity activity,String url){
        Intent intent = new Intent(activity,ImageActivity.class);
        intent.putExtra("url",url);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        ImageView image = findViewById(R.id.image);
        String url = getIntent().getExtras().getString("url","");
        Picasso.get().load(url).into(image);
    }
}