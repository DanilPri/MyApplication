package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static Game g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        g = new Game(10, 10);
        setContentView(new MyDraw(this));
        ArrayList <ArrayList<Integer>> result = g.Game1();
        String lg = "";
        Log.d("game111",g.Game1().get(0).toString());


    }
}