package com.example.android.yodha;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.yodha.R;

public class MainActivity extends AppCompatActivity {
    private Button next;
    private TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = findViewById(R.id.button);
        editText = findViewById(R.id.editTextTextEmailAddress3);

    }

    public void next(View view) {
        if (!(editText.getText().toString().isEmpty())) {
            Intent intent = new Intent(this, com.example.android.yodha.NavigateTo.class);
            startActivity(intent);
        } else {
            Toast.makeText(MainActivity.this, "Enter you email id ", Toast.LENGTH_SHORT).show();
        }
    }
}