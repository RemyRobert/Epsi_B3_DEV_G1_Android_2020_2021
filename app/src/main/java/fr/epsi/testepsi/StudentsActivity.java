package fr.epsi.testepsi;

import android.content.Intent;
import android.os.Bundle;

public class StudentsActivity extends EpsiActivity {

    public static void displayActivity(EpsiActivity activity){
        Intent intent=new Intent(activity,StudentsActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        setTitle("Students");
        showBack();
    }
}