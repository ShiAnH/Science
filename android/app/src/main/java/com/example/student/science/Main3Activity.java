package com.example.student.science;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.student.science.R;

public class Main3Activity extends AppCompatActivity {
    Bundle bd;
    Intent it;
    double mDouble;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        it = getIntent();
        double weight = bd.getDouble("weight");

        mDouble = weight/8;

    }
}
