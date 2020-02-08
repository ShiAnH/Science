package com.example.student.science;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.student.science.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button btn, btn2;
        final EditText etweight, etheight;
        etweight = findViewById(R.id.editText3);
        etheight = findViewById(R.id.editText4);
        btn = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double w = Double.parseDouble(etweight.getText().toString());
                double h = Double.parseDouble(etheight.getText().toString());
                Bundle bd = new Bundle();
                bd.putDouble("weight", w);
                bd.putDouble("height", h);

                Intent it = new Intent(Main2Activity.this, Main3Activity.class);
                it.putExtras(bd);
                startActivity(it);
            }
        });
    }
}
