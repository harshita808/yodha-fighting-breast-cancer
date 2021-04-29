package com.example.android.yodha;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.yodha.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StoriesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StoriesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public StoriesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment StoriesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StoriesFragment newInstance(String param1, String param2) {
        StoriesFragment fragment = new StoriesFragment();
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
        View in = inflater.inflate(R.layout.fragment_stories, container, false);

        final ArrayList<com.example.android.yodha.Stories> words = new ArrayList<>();
        words.add(new com.example.android.yodha.Stories("\"I can feel the edge of the grief washing up on my toes. It lingers there, then recedes like the tide. I'm gonna let it come, and I'm going to LET IT GO.\"","Taddie Diagnosed at 38", R.drawable.image_crop1, "https://zenitsu.s3.ap-south-1.amazonaws.com/Taddie+_+Young+Survival+Coalition.html"));
        words.add(new com.example.android.yodha.Stories("\"Covid has made this already hard situation much harder as I had to do my last few chemo treatments alone, surgery alone, radiation alone.\"", "Sarah Diagnosed at 41",R.drawable.image_crop2, "https://zenitsu.s3.ap-south-1.amazonaws.com/Sarah+_+Young+Survival+Coalition.html "));
        words.add(new com.example.android.yodha.Stories("\"As of September 2020 I have been cancer free since March 2020. I have hormone therapy left for five years. It's okay. I will do it. I will make it. You will make it too.\"","Sabreen Diagnosed at 30", R.drawable.image_crop3, "https://zenitsu.s3.ap-south-1.amazonaws.com/Sabreen+_+Young+Survival+Coalition.html"));
        words.add(new com.example.android.yodha.Stories("\"I was diagnosed at the age of 19 and I am now 23 years old and still battling cancer.\"","JaLaine Diagnosed at 19", R.drawable.image_crop4, "https://zenitsu.s3.ap-south-1.amazonaws.com/JaLaine+_+Young+Survival+Coalition.html"));
        words.add(new com.example.android.yodha.Stories("\"All I can tell you is this—I am 42 years old today and have carried scars from my cancer inside and outside when I barely just turned 31 years old.\"","Uyen Diagnosed at 31", R.drawable.image_crop5, "https://zenitsu.s3.ap-south-1.amazonaws.com/Uyen+_+Young+Survival+Coalition.html"));

        com.example.android.yodha.StoriesAdapter storiesAdapter = new com.example.android.yodha.StoriesAdapter(getActivity(), words);
        ListView listView = in.findViewById(R.id.list);

        listView.setAdapter(storiesAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                com.example.android.yodha.Stories stories = words.get(position);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(stories.getmUrl()));
                startActivity(intent);
            }
        });
        return in;

    }


}