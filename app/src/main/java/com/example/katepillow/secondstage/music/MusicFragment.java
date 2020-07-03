package com.example.katepillow.secondstage;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.katepillow.R;
import com.example.katepillow.RecyclerViewAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MusicFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MusicFragment extends Fragment {

    private static final String TAG = "MusicFragment";

    public ArrayList<String> mImgNames = new ArrayList<>();
    public ArrayList<String> mImgUrls = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MusicFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MusicFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MusicFragment newInstance(String param1, String param2) {
        MusicFragment fragment = new MusicFragment();
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
        Log.d(TAG, "onCreate: sterted.");
        initImageBitmaps();



    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImgUrls.add("https://images.app.goo.gl/6ax4vuTfiYASqhZh8.jpg");
        mImgUrls.add("https://images.app.goo.gl/XeDqGhBygmPs7MSz8.jpg");
        mImgUrls.add("https://images.app.goo.gl/Qxb8BHrJgMB24ww29.jpg");
        mImgUrls.add("https://images.app.goo.gl/B72TCZoXkJGd76dB8.jpg");
        mImgUrls.add("https://images.app.goo.gl/DKVaWS1KuYeYrvcf9.jpg");
        mImgUrls.add("https://images.app.goo.gl/6ax4vuTfiYASqhZh8.jpg");
        mImgUrls.add("https://images.app.goo.gl/XeDqGhBygmPs7MSz8.jpg");
        mImgUrls.add("https://images.app.goo.gl/Qxb8BHrJgMB24ww29.jpg");
        mImgUrls.add("https://images.app.goo.gl/B72TCZoXkJGd76dB8.jpg");
        mImgUrls.add("https://images.app.goo.gl/DKVaWS1KuYeYrvcf9.jpg");

        mImgNames.add("Звуки природы");
        mImgNames.add("Звуки дождя");
        mImgNames.add("Звуки леса");
        mImgNames.add("Звуки птиц");
        mImgNames.add("Звуки урагана");
        mImgNames.add("Звуки волн");
        mImgNames.add("Звуки шелеста листьев");
        mImgNames.add("Звуки сильного ветра");
        mImgNames.add("Звуки прибоя");
        mImgNames.add("Звуки снега");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_music, container, false);

        View view = inflater.inflate(R.layout.fragment_music, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getActivity(), mImgNames, mImgUrls);
        recyclerView.setAdapter(adapter);
        return view;

    }

}