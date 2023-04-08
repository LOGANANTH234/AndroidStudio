package com.example.snapchat;

import static androidx.core.app.ActivityCompat.startActivityForResult;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class snapchatAdapter extends RecyclerView.Adapter<snapchatAdapter.viewHolder>{


    private  ArrayList<snapclass> al = new ArrayList<>();

    private static final int CAMERA_REQUEST = 1;

private Context context;
    public snapchatAdapter(Context context) {
this.context=context;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.snapxml,parent,false);
      viewHolder holder= new viewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.name.setText(al.get(position).getName());
        holder.recievedtxt.setText(al.get(position).getReceived());
        holder.time.setText(al.get(position).getTime());


        holder.imageface.setImageResource(al.get(position).getImageface());
        holder.recievedimage.setImageResource(al.get(position).getImagerecived());




       holder.camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraa= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                ((Activity) context).startActivityForResult(cameraa,CAMERA_REQUEST);

            }
        });
    }

    @Override
    public int getItemCount() {
        return al.size();
    }

    public  class viewHolder extends RecyclerView.ViewHolder{
        private ImageView imageface;
        private TextView name;
        private  ImageView recievedimage;
        private  TextView recievedtxt;
        private TextView time;
        private ImageView camera;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageface=itemView.findViewById(R.id.imgface);
            name=itemView.findViewById(R.id.name);
           recievedimage=itemView.findViewById(R.id.recivedimgid);
          recievedtxt=itemView.findViewById(R.id.calledid);
            time=itemView.findViewById(R.id.timee);
            camera =  itemView.findViewById(R.id.imgCamera);
        }
    }

    public void setAl(ArrayList<snapclass> al) {
        this.al = al;
        notifyDataSetChanged();
    }
}
