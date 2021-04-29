package com.example.android.yodha;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.example.android.yodha.R;

public class NavigateTo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate_to);
    }

    public void nonPatient(View view) {
        Intent intent = new Intent(NavigateTo.this, com.example.android.yodha.QuizActivity.class);
        startActivity(intent);
    }

    public void Patient(View view) {
        Intent intent = new Intent(NavigateTo.this, com.example.android.yodha.StageActivity1.class);
        startActivity(intent);
    }

    public void Surv(View view) {
        Intent intent = new Intent(NavigateTo.this, com.example.android.yodha.Stage2.class);
        startActivity(intent);
    }
}