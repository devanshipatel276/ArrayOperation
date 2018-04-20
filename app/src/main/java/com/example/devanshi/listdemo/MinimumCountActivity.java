package com.example.devanshi.listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MinimumCountActivity extends AppCompatActivity {
    EditText list, minimumvalue, count, element, displaylist;
    ArrayList<Integer> maxvalue = new ArrayList<>();
    List<String> finalList = new ArrayList<>();
    String enteredList;
    private static final String TAG = "MinimumCountActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minimum_count);

        list = findViewById(R.id.list);
        minimumvalue = findViewById(R.id.minimumValue);
        count = findViewById(R.id.count);
        element = findViewById(R.id.element);
        displaylist = findViewById(R.id.displayList);

        Button submit = findViewById(R.id.btnSubmitList);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enteredList = list.getText().toString();

                finalList = Arrays.asList(enteredList.split("\\s*,\\s*"));
                TreeSet<String> listToSet = new TreeSet<String>(finalList);
                List<String> listWithoutDuplicates = new ArrayList<String>(listToSet);

                    methodforcount();
                Log.d(TAG, "onClick: "+maxvalue);

                int value = Collections.max(maxvalue);
                int removeEelementSize = finalList.size() - Collections.max(maxvalue);
                minimumvalue.setText("" + removeEelementSize);
                if (maxvalue.contains(value)) {
                    count.setText("" + value);
                    element.setText("" + listWithoutDuplicates.get(maxvalue.indexOf(value)));

                }

                displaylist.setText("" + finalList);


                //list.setText("");
                maxvalue.clear();
                listWithoutDuplicates.clear();
            }


        });


    }

    private void methodforcount()
    {

       Map<String, Integer> duplicates = new TreeMap<String,Integer>();
        for (String str : finalList) {
            if (duplicates.containsKey(str)) {
                duplicates.put(str, duplicates.get(str) + 1);
            } else {
                duplicates.put(str, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : duplicates.entrySet()) {
            maxvalue.add(entry.getValue());
        }

    }
}
