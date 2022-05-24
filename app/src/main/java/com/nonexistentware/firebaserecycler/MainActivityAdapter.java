package com.nonexistentware.firebaserecycler;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import okhttp3.internal.Util;

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.MyViewHolder> {

    List<PlayerModel> playerModelList;
    Context context;

    public MainActivityAdapter(List<PlayerModel> playerModelList, Context context) {
        this.playerModelList = playerModelList;
        this.context = context;
    }

    public void addAll(List<PlayerModel> newPlayer) {
        int intSize = playerModelList.size();
        playerModelList.addAll(newPlayer);
        notifyItemRangeChanged(intSize, newPlayer.size());
    }

    public String getLastItem() {
        return playerModelList.get(playerModelList.size()-1).getPlayerName();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.player_list_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.pEmail.setText("email" + playerModelList.get(position).getPlayerEmail());
        holder.pName.setText("name" + playerModelList.get(position).getPlayerName());
        Picasso.get()
                .load(Uri.parse(playerModelList.get(position).getImgUrl()))
                .placeholder(com.firebase.ui.database.R.drawable.common_google_signin_btn_icon_dark)
                .error(com.firebase.ui.database.R.drawable.common_google_signin_btn_icon_dark)
                .into(holder.pImg);
    }

    @Override
    public int getItemCount() {
        return playerModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView pName, pEmail;
        ImageView pImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            pName = itemView.findViewById(R.id.player_name);
            pEmail = itemView.findViewById(R.id.player_email);
            pImg = itemView.findViewById(R.id.player_img);

        }
    }
}
