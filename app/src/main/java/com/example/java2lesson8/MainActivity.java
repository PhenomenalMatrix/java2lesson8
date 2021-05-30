package com.example.java2lesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private String txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.send_btn);
        editText = findViewById(R.id.edit_txt);
        // Адрес для перехода
        Intent intent = new Intent(this,GetDataActivity.class);
        button.setOnClickListener(view -> {
            // Берем текст с editText
            txt = editText.getText().toString();
            // Засовываем данные в интент
            intent.putExtra("text",txt);
            intent.putExtra("text",txt);
            // Для перехода
            startActivity(intent);
        });
    }
}