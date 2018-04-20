package com.example.devanshi.listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class ListDemoActivity extends AppCompatActivity
{
    int a[]=new int[5];
    private static final String TAG="ListDemoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        a[0]=5;
        a[1]=3;
        a[2]=8;
        Log.d(TAG, "onCreate: "+a[0]);
        Log.d(TAG, "onCreate: "+a[1]);
        Log.d(TAG, "onCreate: "+a[2]);
        listchange(a);
        EditText result=findViewById(R.id.etList);

        String sep = "";
        StringBuilder sb = new StringBuilder() ;
        for (Object x: a) {
            sb.append(sep).append(x);
            sep = ",";
        }
        result.setText(sb);
    }

    private void listchange(int a[])
    {
        a[0]=15;
        a[1]=13;
        a[2]=18;
    }
}
