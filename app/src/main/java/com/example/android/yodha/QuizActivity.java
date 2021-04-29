package com.example.android.yodha;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.yodha.R;
import com.example.android.yodha.SurgeryInfo;

import java.util.ArrayList;


public class QuizActivity extends AppCompatActivity {
    public ArrayList<String> questions;
    public TextView question;
    public static int i = 0;
    public static String[] arr;
    public Button next;
    public Button previous;
    public RadioButton radioButton1;
    public RadioButton radioButton2;
    public RadioGroup radioGroup;
    public RadioButton selectedRadioButton;
    private Toast mToastToShow;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        question = findViewById(R.id.textView2);
        next = (Button) findViewById(R.id.Next);
        previous = findViewById(R.id.Previous);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioGroup = findViewById(R.id.radio);
        questions = new ArrayList<>();

        questions.add(getString(R.string.question_1));
        questions.add(getString(R.string.question_2));
        questions.add(getString(R.string.question_3));
        questions.add(getString(R.string.question_4));
        questions.add(getString(R.string.question_5));
        questions.add(getString(R.string.question_6));
        questions.add(getString(R.string.question_7));
        questions.add(getString(R.string.question_8));


        arr = new String[questions.size()];
        question.setText(questions.get(0));


        next.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                selectedRadioButton = (RadioButton) findViewById(selectedId);
                if (radioGroup.getCheckedRadioButtonId() == -1) {


                    Toast.makeText(QuizActivity.this, "No answer selected", Toast.LENGTH_SHORT).show();


                } else {
                    previous.setVisibility(View.GONE);
                    next.setX(420);
                    i++;
                    if (i < questions.size() - 1) {
                        question.setText(questions.get(i));


                    } else if (i >= questions.size() - 1 && i < questions.size()) {

                        next.setText("Finish Quiz");
                        next.setX(490);
                        question.setText(questions.get(i));
                    } else if (i >= questions.size()) {
                        next.setVisibility(View.GONE);
                        Intent intent = new Intent(QuizActivity.this, SurgeryInfo.QuizResult.class);
                        startActivity(intent);

                    }
                    boolean result = false;
                    result = radioButton1.isChecked();


                    radioGroup.clearCheck();

                }
            }
        });

    }

    public void onRadioClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        String str = "";

        switch (view.getId()) {
            case R.id.radioButton1:
                if (checked) {
                    str = "yes";
                    arr[i] = str;
                }
                break;
            case R.id.radioButton2:
                if (checked) {
                    str = "No";
                    arr[i] = str;
                }
                break;

        }
        int toastDurationInMilliSeconds = 100;
        mToastToShow = Toast.makeText(this, str, Toast.LENGTH_SHORT);

        // Set the countdown to display the toast
        CountDownTimer toastCountDown;
        toastCountDown = new CountDownTimer(toastDurationInMilliSeconds, 1) {
            public void onTick(long millisUntilFinished) {
                mToastToShow.show();
            }

            public void onFinish() {
                mToastToShow.cancel();
            }
        };

        // Show the toast and starts the countdown
        mToastToShow.show();
        toastCountDown.start();

    }

    public void previousQuestion(View view) {

        Intent intent = new Intent(QuizActivity.this, com.example.android.yodha.NavigateTo.class);
        startActivity(intent);
    }
}

