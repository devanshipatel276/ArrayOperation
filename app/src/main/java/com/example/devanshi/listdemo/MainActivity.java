package com.example.devanshi.listdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnListActivity=findViewById(R.id.btnListActivity);
        btnListActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,ListDemoActivity.class);
                startActivity(i);
            }
        });

        Button btnArryalistActivity=findViewById(R.id.btnArrayListActivity);
        btnArryalistActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,ArrayListDemoActivity.class);
                startActivity(i);
            }
        });

        Button btnRotationActibity=findViewById(R.id.btnRotationActivity);
        btnRotationActibity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,RotationOfArrayActivity.class);
                startActivity(i);
            }
        });

        Button btnMinimumActivity=findViewById(R.id.btnMinimumActivity);
        btnMinimumActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MinimumCountActivity.class);
                startActivity(i);
            }
        });
    }
}
