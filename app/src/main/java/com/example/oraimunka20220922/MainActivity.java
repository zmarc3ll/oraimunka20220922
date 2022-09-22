package com.example.oraimunka20220922;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button1;
    private Button button2;
    private Button button3;
    private EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String szoveg = inputText.getText().toString().toUpperCase();
                textView.setText(szoveg);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String szoveg = inputText.getText().toString().toLowerCase();
                textView.setText(szoveg);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String szoveg = inputText.getText().toString();
                textView.setText(szoveg);
                Random rnd = new Random();
                int red = rnd.nextInt(256);
                int green = rnd.nextInt(256);
                int blue = rnd.nextInt(256);
                textView.setBackgroundColor(Color.rgb(red, green, blue));
            }
        });
    }

    public void init() {

        inputText = (EditText) findViewById(R.id.inputText);
        textView = (TextView) findViewById(R.id.kiirtSzoveg);
        button1 = (Button) findViewById(R.id.nagyBetu);
        button2 = (Button) findViewById(R.id.kisBetu);
        button3 = (Button) findViewById(R.id.randomColor);
    }
}