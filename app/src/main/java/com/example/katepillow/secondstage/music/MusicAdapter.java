package com.example.katepillow.secondstage.music;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.katepillow.R;
import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private List<MusicItem> musicItems;
    private Context mContext;

    public MusicAdapter(Context mContext, List<MusicItem> musicItems) {
        this.musicItems = musicItems;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.music_list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");

        Glide.with(mContext)
                .asBitmap()
                .load(musicItems.get(position))
                .into(holder.imageView);

        holder.imgName.setText(musicItems.get(position).getTitle());
        //holder.imageView.setImageResource(musicItems.get(position).getImgUrl());

        holder.relativeLayoutListItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on: " + musicItems.get(position));

                //Toast.makeText(mContext, musicItems.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return musicItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView imgName;
        private RelativeLayout relativeLayoutListItem;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView)itemView.findViewById(R.id.item_image);
            imgName = (TextView)itemView.findViewById(R.id.item_image_name);
            relativeLayoutListItem = itemView.findViewById(R.id.relativeLayout_list_item);
        }
    }
}
