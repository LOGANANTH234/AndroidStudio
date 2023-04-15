package com.example.snapchat;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
private  ImageView img2,searchin;
private TextView cancelid,recentid;
private RelativeLayout searchreltive,newrelative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerid);

        ArrayList<snapclass> all = new ArrayList<>();
        all.add(new snapclass(R.drawable.img_13, "Loga", R.drawable.delievered, "Delivered", ". just now"));
        all.add(new snapclass(R.drawable.img_35, "Ahalya", R.drawable.redreceived, "Tap-to-reply", ". 2m"));
        all.add(new snapclass(R.drawable.img_29, "Kishore", R.drawable.screenshot, "Screenshot", ". 10m"));
        all.add(new snapclass(R.drawable.img_16, "Kabil", R.drawable.bluerecieved, "Received ", ". 34m"));
        all.add(new snapclass(R.drawable.img_8, "Saran", R.drawable.replay, "Snap-replayed", ". 36m"));
        all.add(new snapclass(R.drawable.img_26, "Subash", R.drawable.receivedmsgblue, "Newchat", ". 1h"));
        all.add(new snapclass(R.drawable.img_14, "Raj", R.drawable.img_3, "Opened", ". 18h"));
        all.add(new snapclass(R.drawable.img_15, "Tamil", R.drawable.img, "New snap", ". 22h"));
        all.add(new snapclass(R.drawable.img_24, "Bala", R.drawable.img_1, "Delivered", ". 1d"));
        all.add(new snapclass(R.drawable.img_9, "Kavin", R.drawable.img_2, "Tap to chat", ". 2d"));
        all.add(new snapclass(R.drawable.img_25, "Akil", R.drawable.bluerecieved, "Received", ". 1w"));
        all.add(new snapclass(R.drawable.img_20, "Luksith", R.drawable.redreceived, "Tap-to-reply", ". 2w"));
        all.add(new snapclass(R.drawable.img_33, "Eswar", R.drawable.img_3, "Opened", ". 2m"));
        all.add(new snapclass(R.drawable.img_30, "Abilesh", R.drawable.img_1, "Delivered", ". 11m"));
        all.add(new snapclass(R.drawable.img_21, "Cibi", R.drawable.delievered, "Delivered", ". 12m"));


        snapchatAdapter adapter = new snapchatAdapter(this);
        ;
        adapter.setAl(all);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        img2=findViewById(R.id.image2);
        searchin=findViewById(R.id.searchin);
searchreltive=findViewById(R.id.searchreltive);
        newrelative=findViewById(R.id.newrelative);
cancelid=findViewById(R.id.cancelidtext);
        recentid=findViewById(R.id.recents);
     img2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             searchreltive.setVisibility(View.VISIBLE);
         }
     });

       cancelid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchreltive.setVisibility(View.INVISIBLE);
                newrelative.setVisibility(View.INVISIBLE);
            }
        });


searchin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        newrelative.setVisibility(View.VISIBLE);
    }
});
    }





}