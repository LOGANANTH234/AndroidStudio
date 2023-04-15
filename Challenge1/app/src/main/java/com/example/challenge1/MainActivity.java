package com.example.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 private  Spinner spinner;
 private ImageView img;
 private Button btn,btn2;
 private EditText name,email,pass,repass;
 private CheckBox agree;
 private RadioGroup radio;
 private TextView cntry,gender,bigtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        ArrayList<String > al = new ArrayList<>();
        al.add("Loga");
        al.add("tamil");
        al.add("Subash");
        al.add("raj");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                al
        );
spinner.setAdapter(adapter);


method();
    }


    public  void method(){
        img=findViewById(R.id.img);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.pass);
        repass=findViewById(R.id.reenter);
       gender=findViewById(R.id.gender);
        cntry=findViewById(R.id.cntry);
        gender=findViewById(R.id.gender);
        

    }
}