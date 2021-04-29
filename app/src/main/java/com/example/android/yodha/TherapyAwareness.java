package com.example.android.yodha;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.android.yodha.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TherapyAwareness#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TherapyAwareness extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TherapyAwareness() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TherapyAwareness.
     */
    // TODO: Rename and change types and number of parameters
    public static TherapyAwareness newInstance(String param1, String param2) {
        TherapyAwareness fragment = new TherapyAwareness();
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
        View inflator = inflater.inflate(R.layout.fragment_therapy_awareness, container, false);
        Button chemo =inflator.findViewById(R.id.chemo) ;
        Button surgery =inflator.findViewById(R.id.surgery) ;
        Button radth =inflator.findViewById(R.id.radiation) ;
        Button hormoth =inflator.findViewById(R.id.hormonal) ;

        chemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm =getFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container,(Fragment)new com.example.android.yodha.Chemotherapy()).commit();

            }
        });
        surgery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm =getFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container,(Fragment)new com.example.android.yodha.Surgery()).commit();

            }
        });
        radth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm =getFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container,(Fragment)new com.example.android.yodha.RadiationTherapy()).commit();


            }
        });
        hormoth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm =getFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container,(Fragment)new com.example.android.yodha.HormonalTherapy()).commit();


            }
        });
        return inflator;
    }
}