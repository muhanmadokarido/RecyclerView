package com.mk_kadish.mk3;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.ImageViewHolder> {
    private Context context;
    private int[] images;

    public recyclerAdapter(int[] images,Context context)
    {
        this.images=images;
        this.context=context;

    }
    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.album_layout,parent,false);
        ImageViewHolder imageViewHolder=new ImageViewHolder(view,context,images);
        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position)
    {
        int image_id=images[position];
        holder.album.setImageResource(image_id);
        holder.album_title.setText("Image:"+position);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        ImageView album;
        TextView album_title;
        Context context;
        int[] images;

        public ImageViewHolder(@NonNull View itemView,Context context,int[] images ) {
            super(itemView);
            album=itemView.findViewById(R.id.album);
            album_title=itemView.findViewById(R.id.album_title);
            itemView.setOnClickListener(this);
            this.context=context;
            this.images=images;
        }

        @Override
        public void onClick(View v) {
           // ImageView imageView1 = null;
           // ImageView imageView2 = null;
            int curPos = images[getAdapterPosition()];

            switch (curPos)
            {
                case R.drawable.image1:
                    context.startActivity(new Intent(context, game1_HomeActivity.class));
                    break;
                case R.drawable.image2:
                    context.startActivity(new Intent(context, game2_HomeActivity.class));
                    break;
                case R.drawable.image3:
                    context.startActivity(new Intent(context, game3_HomeActivity.class));
                    break;
                case R.drawable.image4:
                    context.startActivity(new Intent(context, game4_HomeActivity.class));
                    break;
                case R.drawable.image5:
                    context.startActivity(new Intent(context, game1_HomeActivity.class));
                    break;
                case R.drawable.image6:
                    context.startActivity(new Intent(context, game2_HomeActivity.class));
                    break;
                case R.drawable.image7:
                    context.startActivity(new Intent(context, game3_HomeActivity.class));
                    break;
                case R.drawable.image8:
                    context.startActivity(new Intent(context, game4_HomeActivity.class));
                    break;
            }
        }
    }
}
