package com.example.jsonobject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1= findViewById(R.id.showId);
        t2= findViewById(R.id.showId2);

        String json = "doa_data.json";
        MainData parsedJson = new Gson().fromJson(json, MainData.class);

        parsedJson.getSaturday().get1().getEnglish();
        parsedJson.getSaturday().get2().getHindi();

        t1.setText((CharSequence) parsedJson);
        t2.setText((CharSequence) parsedJson);








    }
}