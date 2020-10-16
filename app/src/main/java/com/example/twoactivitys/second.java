package com.example.twoactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class second extends AppCompatActivity {
    TextView textview;
    TextView text1;
    String mes ="Response";
    String rec = "Message Received";
    String name = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_second);
         textview = findViewById(R.id.textview4);
         textview.setText(intent.getStringExtra("message1").toString());
        name = intent.getStringExtra("message1");
    }


    public void launchMain(View view){
        Intent intent = new Intent(this,MainActivity.class);
        text1 = findViewById(R.id.message2);
        intent.putExtra("responsemessage",text1.getText().toString());
        intent.putExtra("mes",mes);
        intent.putExtra("rec",rec);
        intent.putExtra("name",name);
        startActivity(intent);


    }
}