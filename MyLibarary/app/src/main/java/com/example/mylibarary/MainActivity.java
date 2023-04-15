package com.example.mylibarary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private ImageView img;
   private TextView txt;
   private Button SeeAllBooks,CurrentlyReadingBooks,AllReadBooks,YourWhilist,YourFavourties,About;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id();

        SeeAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,SeeallbooksActivity2.class);
               startActivity(intent);

            }
        });
    }
    public void id(){
        img=findViewById(R.id.img);
        txt=findViewById(R.id.lib);
        SeeAllBooks=findViewById(R.id.seeallbooks);
      CurrentlyReadingBooks=findViewById(R.id.CurrentlyReadingBooks);
      AllReadBooks=findViewById(R.id.AllReadBooks);
      YourWhilist=findViewById(R.id.YourFavourties);
      YourFavourties=findViewById(R.id.YourFavourties);
       About=findViewById(R.id.About);

    }
}