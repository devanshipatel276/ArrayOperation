package com.example.devanshi.listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotationOfArrayActivity extends AppCompatActivity {
    EditText listArray, rotationDigit, afterRoatationPosition, ans;
    String List, rotationCount, position;
    TextView textView;
    Switch switchbutton;

    List<String> result = new ArrayList<>();
    private static final String TAG = "RotationOfArrayActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotation_of_array);

        listArray = findViewById(R.id.entrylist);
        rotationDigit = findViewById(R.id.rotationDigit);
        afterRoatationPosition = findViewById(R.id.afterRotationPosition);
        switchbutton = findViewById(R.id.switchButton);
        textView = findViewById(R.id.textView);
        ans = findViewById(R.id.result);
        final Button submit = findViewById(R.id.btnSubmitArray);
        switchbutton.setChecked(true);


        ArrayList<String> FinalList = new ArrayList<String>(result.size());
        textView.setText("Right to Left Rotation");
        switchbutton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    textView.setText("Right to Left Rotation");
                } else {
                    textView.setText("Left to Right Rotation");

                }
            }
        });
        switchbutton.setChecked(true);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List = listArray.getText().toString();
                rotationCount = rotationDigit.getText().toString();
                List<String> result = Arrays.asList(List.split("\\s*,\\s*"));
                Log.d(TAG, "onClick: HERE " + result);
                int rotation = Integer.parseInt(rotationCount) % result.size();



                if (switchbutton.isChecked()) {
                    textView.setText("Right to Left Rotation");

                    if (rotation == 0) {
                        for (int i = 0; i < result.size(); i++) {
                            FinalList.add(result.get(i));
                        }
                    } else {
                        for (int i = 0; i < result.size(); i++) {
                            int newposition = i + rotation;

                            if (newposition >= result.size()) {
                                newposition = newposition % result.size();
                                int val = Integer.parseInt(result.get(newposition));
                                FinalList.add(String.valueOf(val));

                            } else {
                                int val = Integer.parseInt(result.get(newposition));
                                FinalList.add(String.valueOf(val));

                            }

                        }
                    }
                } else {
                    textView.setText("Left to Right Rotation");

                    if (rotation == 0) {
                        for (int i = 0; i < result.size(); i++) {
                            FinalList.add(result.get(i));
                        }
                    } else {
                        for (int i = result.size(); i > 0; i--) {
                            int newposition = i - rotation;

                            if (newposition < 0) {
                                newposition = newposition + result.size();
                                int val = Integer.parseInt(result.get(newposition));
                                FinalList.add(String.valueOf(val));

                            } else {
                                int val = Integer.parseInt(result.get(newposition));
                                FinalList.add(String.valueOf(val));

                            }

                        }
                    }

                }


//                for (int i = 0; i < result.size(); i++) {
//                    int newposition = i + rotation;
//
//                    if (newposition >= result.size()) {
//                        newposition = newposition % result.size();
//                        int val= Integer.parseInt(result.get(newposition));
//                        FinalList.add(String.valueOf(val));
//
//                    } else {
//                        int val= Integer.parseInt(result.get(newposition));
//                        FinalList.add(String.valueOf(val));
//
//                    }
//
//                }


                position = afterRoatationPosition.getText().toString();

                if (Integer.parseInt(position) >= result.size())

                {
                    Toast.makeText(RotationOfArrayActivity.this, "Please Enter Valid Position", Toast.LENGTH_SHORT).show();
                } else

                {
                    Log.d(TAG, "onClick: " + FinalList);
                    ans.setText(FinalList.get(Integer.parseInt(position)));
                    FinalList.clear();

                }

            }

        });
    }
}







