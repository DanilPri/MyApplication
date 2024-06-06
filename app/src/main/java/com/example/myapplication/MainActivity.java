package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    static Game g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//
//
//        setContentView();
        setContentView(R.layout.activity_main);
        LinearLayout drawView = findViewById(R.id.DrawView);
        g = new Game(10, 10);
        drawView.addView(new MyDraw(this));
        ArrayList <ArrayList<Integer>> result = g.Game1();

        List<String> stringList = new ArrayList<>();
        for (List<Integer> sublist : result) {
            StringBuilder sb = new StringBuilder();
            for (Integer number : sublist) {
                sb.append(number).append(" ");
            }
            stringList.add(sb.toString().trim());
        }

//        List<String> horizontalStringList = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

        // Найти горизонтальный LinearLayout и добавить в него TextView
        LinearLayout verticalLayout = findViewById(R.id.verticalAxis);

        for (String number : stringList) {
            TextView textView = new TextView(this);
            textView.setGravity(Gravity.RIGHT);
            textView.setText(number);
            textView.setPadding(10, 0, 10, 0); // Добавить отступы, если нужно
            verticalLayout.addView(textView);
        }





    }
}