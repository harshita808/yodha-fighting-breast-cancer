package com.example.android.yodha;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.android.yodha.R;

public class Stage2 extends AppCompatActivity {
    private Spinner spinner;
    String actualPositionOfMySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage2);
        spinner = findViewById(R.id.spinner);
        addListenerOnSpinnerItemSelection();
    }

    private void addListenerOnSpinnerItemSelection() {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int selectedItemOfMySpinner = spinner.getSelectedItemPosition();
                actualPositionOfMySpinner = (String) spinner.getItemAtPosition(selectedItemOfMySpinner);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void onClick(View view) {
        { Intent intent = new Intent(Stage2.this, com.example.android.yodha.bottom_navigation2.class);
            startActivity(intent);}
       // else Toast.makeText(Stage2.this,"Enter required fields !",Toast.LENGTH_SHORT).show();

    }
}