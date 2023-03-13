package com.example.myandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView tv;
    private EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textVIewTest);
        btn = findViewById(R.id.btnPlusWord);
        et = findViewById(R.id.etSlovo);

       btnClick();
    }

    private void plusWord(String text){
       tv.append(" " + text);
    }

    private void btnClick() {
        btn.setOnClickListener(view ->
                plusWord(et.getText().toString()));
    }
}