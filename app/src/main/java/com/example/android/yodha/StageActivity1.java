package com.example.android.yodha;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.android.yodha.R;

public class StageActivity1 extends AppCompatActivity {
    private Spinner spinner;
    private EditText mobileNumber;
    private Button nextButton;
    String actualPositionOfMySpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage1);
        spinner = findViewById(R.id.stages);
        mobileNumber = findViewById(R.id.mobile);
        nextButton = findViewById(R.id.next);
        addListenerOnSpinnerItemSelection();
    }
    public void addListenerOnSpinnerItemSelection() {

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

    public void next(View view){
        if(actualPositionOfMySpinner!= null){ Intent intent = new Intent(StageActivity1.this, com.example.android.yodha.bottom_navigation.class);
            startActivity(intent);}
        else Toast.makeText(StageActivity1.this,"Enter required fields !",Toast.LENGTH_SHORT).show();


        {
            if (!(mobileNumber.getText().toString().isEmpty())) {
                Intent intent = new Intent(StageActivity1.this, com.example.android.yodha.bottom_navigation.class);
                startActivity(intent);
            } else
                Toast.makeText(StageActivity1.this, "Enter your mobile number", Toast.LENGTH_SHORT).show();
        }
    }






}