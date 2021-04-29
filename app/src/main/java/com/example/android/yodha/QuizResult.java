package com.example.android.yodha;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.yodha.QuizActivity;
import com.example.android.yodha.R;

public class QuizResult extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        setTextView();

    }
    private void setTextView(){
        int c=0,k;
        for(k=0; k< QuizActivity.arr.length; k++){
            if(QuizActivity.arr[k] == "yes")c++;
        }

        if(c>2&&c<=6){textView1.setText("MEDIUM");textView2.setText("You're at a medium risk of having breast cancer we would suggest you to talk to our expert about your concerns by clicking on the call button");}
        else if(c>6){textView1.setText("HIGH");textView2.setText("You're at a high risk of having breast cancer we would suggest you to talk to our expert about your concerns by clicking on the call button");}
        else{textView1.setText("LOW");textView2.setText("You're at a low risk of having breast cancer we would suggest you to talk to our expert about your concerns by clicking on the call button");}
    }

    public void myPhone(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        startActivity(intent);
    }

    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https:/www.cancer.org/cancer/breast-cancer.html"));
        startActivity(intent);
    }
}