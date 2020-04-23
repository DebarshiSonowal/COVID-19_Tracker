package com.deb.covid_19tracker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends  RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<Integer>mDrawableResList;
    private List<String>mStringList;
    private Context context ;
    private LayoutInflater mLayoutInflater;
    private List<ColorInt>mInts = new ArrayList<>();


    public Adapter(Context context, List<Integer> drawableResList, List<String> stringList) {
        this.context = context;
        this.mLayoutInflater = LayoutInflater.from(context);
        mDrawableResList = drawableResList;
        mStringList = stringList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.mImageView.setImageResource(mDrawableResList.get(position));
        holder.mView.setText(mStringList.get(position));
        if(position == 0)
        {
            holder.mConstraintLayout.setBackgroundColor(Color.parseColor("#95EEB3"));
        }
        else if(position == 1)
        {
            holder.mConstraintLayout.setBackgroundColor(Color.parseColor("#59A7F3"));
        }
        else
            holder.mConstraintLayout.setBackgroundColor(Color.parseColor("#FDBE90"));

    }

    @Override
    public int getItemCount() {
        return mDrawableResList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mView;
        ImageView mImageView;
        ConstraintLayout mConstraintLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView.findViewById(R.id.textView5);
            mImageView = itemView.findViewById(R.id.imageView);
            mConstraintLayout = itemView.findViewById(R.id.vb);
        }
    }
}
