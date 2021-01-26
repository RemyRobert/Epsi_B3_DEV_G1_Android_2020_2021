package fr.epsi.testepsi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class StudentsActivity extends EpsiActivity {

    public static void displayActivity(EpsiActivity activity){
        Intent intent=new Intent(activity,StudentsActivity.class);
        activity.startActivity(intent);
    }
    private ArrayList<Student> students;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        setTitle("Students");
        showBack();

        try {
            students=new ArrayList<>();
            JSONObject jsonObject= new JSONObject(Data.allData);
            JSONArray jsonArray = jsonObject.getJSONArray("items");
            for(int i=0;i<jsonArray.length();i++){
                Student student=new Student(jsonArray.getJSONObject(i));
                students.add(student);
            }
            Log.d("Tag","students : "+students.size());

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}