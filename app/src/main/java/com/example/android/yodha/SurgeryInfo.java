package com.example.android.yodha;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.yodha.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SurgeryInfo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SurgeryInfo extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SurgeryInfo() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SurgeryInfo.
     */
    // TODO: Rename and change types and number of parameters
    public static SurgeryInfo newInstance(String param1, String param2) {
        SurgeryInfo fragment = new SurgeryInfo();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_surgery_info, container, false);
    }

    public static class QuizResult extends AppCompatActivity {
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
            for(k=0; k< com.example.android.yodha.QuizActivity.arr.length; k++){
                if(com.example.android.yodha.QuizActivity.arr[k] == "yes")c++;
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
}