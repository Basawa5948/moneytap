package com.basawareddy.moneytap.moneytap.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.basawareddy.moneytap.moneytap.R;
import com.basawareddy.moneytap.moneytap.model.Images;

import java.util.List;

public class imagesAdapter extends RecyclerView.Adapter<imagesAdapter.imagesViewHolder> {

    private List<Images> imagesList;
    private int rowLayout;
    private Context context;

    public static class imagesViewHolder extends RecyclerView.ViewHolder{

        LinearLayout linearLayout;
        TextView textViewns;
        TextView textViewimages;

        public imagesViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.images_layout);
            textViewns = (TextView) itemView.findViewById(R.id.ns);
            textViewimages = (TextView) itemView.findViewById(R.id.title);
        }
    }

    public imagesAdapter(List<Images> imagesList, int list_item_movie, Context applicationContext) {
        this.imagesList = this.imagesList;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @NonNull
    @Override
    public imagesAdapter.imagesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new imagesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull imagesAdapter.imagesViewHolder holder, final int position) {
        holder.textViewns.setText(imagesList.get(position).getNs());
        holder.textViewimages.setText(imagesList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return imagesList.size();
    }
}
