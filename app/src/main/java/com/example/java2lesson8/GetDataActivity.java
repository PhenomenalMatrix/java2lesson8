package com.example.java2lesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GetDataActivity extends AppCompatActivity {

    private TextView textView;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);
        // Создаем интент = получаем интент
        Intent intent = getIntent();
        //Распаковка интента
        data = intent.getStringExtra("text");

        textView = findViewById(R.id.get_tv);

        textView.setText(data);

    }
}