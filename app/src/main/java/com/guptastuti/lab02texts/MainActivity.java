package com.guptastuti.lab02texts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button submitButton1;
    TextView displayText1;
    EditText responseText;
    TextView displayText2;
    Button submitButton2;
    int number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        final String[] planets_array = res.getStringArray(R.array.planets);
        submitButton1=findViewById(R.id.clickButton1);
        submitButton2=findViewById(R.id.clickButton2);
        displayText1=findViewById(R.id.textBox1);
        displayText2=findViewById(R.id.textBox2);
        responseText=findViewById(R.id.responseEditText);
        submitButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i("testButton1", "button1");
                displayText1.setText(responseText.getText());
            }
        });
        submitButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i("testButton2", "button2");
                displayText2.setText(planets_array[number]);
                if (number == planets_array.length - 1)
                {
                    number = 0;
                }
                else {
                    number += 1;
                }
            }
        });
    }
}