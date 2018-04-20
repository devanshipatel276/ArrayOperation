package com.example.devanshi.listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import java.util.ArrayList;

public class ArrayListDemoActivity extends AppCompatActivity
{
    ArrayList<Float> list=new ArrayList<>();
    private static final String TAG="ArrayListDemoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_araay_list);

        list.add((float) 1.5);
        list.add((float) 2.5);
        list.add((float) 3.5);
        Log.d(TAG, "onCreate: "+list);
        listchange(list);
        EditText result=findViewById(R.id.etArrayList);
        result.setText(""+list);
    }

    private void listchange(ArrayList<Float> list)
    {
        list.add((float) 8.5);
        list.add((float) 9.5);
        list.add((float) 10.5);
    }
}
