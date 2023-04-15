package com.example.mylibarary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SeeallbooksActivity2 extends AppCompatActivity {
    private  RecyclerView seallbooksrecyclerView;
    private adapterforseallbooks adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeallbooks2);
        adapter=new adapterforseallbooks(this);
       seallbooksrecyclerView=findViewById(R.id.recycler);
seallbooksrecyclerView.setAdapter(adapter);
seallbooksrecyclerView.setLayoutManager(new LinearLayoutManager(this));
ArrayList<Books>al = new ArrayList<>();
al.add(new Books(1,2,R.drawable.img_7,"Lord Of The Rings","J.R.R.Tolkien","Frodo, a Christlike figure, learns that the ring has the power to control the entire world and, he discovers, to corrupt its owner."));
        al.add(new Books(1,2,R.drawable.img_8,"Harry Potter","J.K.Rowling","Harry Potter, an eleven-year-old orphan, discovers that he is a wizard and is invited to study at Hogwarts. Even as he escapes a dreary life and enters a world of magic."));


adapter.adapterforseallbooks(al);
    }
}