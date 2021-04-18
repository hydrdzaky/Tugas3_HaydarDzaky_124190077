package com.example.b3rc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BallAdapter extends RecyclerView.Adapter<BallAdapter.ViewHolder> {
    private Context context;
    private ArrayList<BallModel> BallModels;

    public BallAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<BallModel> getBallModels() {
        return BallModels;
    }

    public void setBallModels(ArrayList<BallModel> BallModels) {
        this.BallModels = BallModels;
    }

    @NonNull
    @Override
    public BallAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cetak, parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull BallAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(getBallModels().get(position).getGambarBall()).into(holder.gambar);
        holder.text.setText(getBallModels().get(position).getNamaBall());
    }

    @Override
    public int getItemCount() {
        return getBallModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gambar;
        private TextView text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.cetak_gambar);
            text = itemView.findViewById(R.id.cetak_text);
        }
    }
}
