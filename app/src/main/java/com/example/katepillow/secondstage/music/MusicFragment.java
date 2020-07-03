package com.example.katepillow.secondstage.music;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.katepillow.R;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MusicFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MusicFragment extends Fragment {

    private static final String TAG = "MusicFragment";

    private List<MusicItem> musicItems;
    private RecyclerView recyclerView; //добавил

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
        musicItems = new ArrayList<>();

        musicItems.add(new MusicItem(
                "Звуки природы", "https://images.app.goo.gl/6ax4vuTfiYASqhZh8.jpg"
        ));
        musicItems.add(new MusicItem(
                "Звуки дождя", "https://images.app.goo.gl/XeDqGhBygmPs7MSz8.jpg"
        ));
        musicItems.add(new MusicItem(
                "Звуки леса", "https://images.app.goo.gl/Qxb8BHrJgMB24ww29.jpg"
        ));
        musicItems.add(new MusicItem(
                "Звуки птиц", "https://images.app.goo.gl/Qxb8BHrJgMB24ww29.jpg"
        ));
        musicItems.add(new MusicItem(
                "Звуки урагана", "https://images.app.goo.gl/Qxb8BHrJgMB24ww29.jpg"
        ));
        musicItems.add(new MusicItem(
                "Звуки волн", "https://images.app.goo.gl/Qxb8BHrJgMB24ww29.jpg"
        ));
        musicItems.add(new MusicItem(
                "Звуки шелеста листьев", "https://images.app.goo.gl/Qxb8BHrJgMB24ww29.jpg"
        ));
        musicItems.add(new MusicItem(
                "Звуки прибоя", "https://images.app.goo.gl/Qxb8BHrJgMB24ww29.jpg"
        ));
        musicItems.add(new MusicItem(
                "Звуки снега", "https://images.app.goo.gl/Qxb8BHrJgMB24ww29.jpg"
        ));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_music, container, false);

        View view = inflater.inflate(R.layout.fragment_music, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);

        MusicAdapter adapter = new MusicAdapter(getContext(), musicItems);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        return view;

    }
}