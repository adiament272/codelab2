package com.example.twoactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText editText;
    public TextView mes;
    public TextView rep;
    public TextView text3;
    public TextView NAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Intent intent = getIntent();
        mes = findViewById(R.id.Messagereply);
        rep = findViewById(R.id.textView7);
        NAME = findViewById(R.id.textView3);
        text3 = findViewById(R.id.textView2);

        mes.setText(intent.getStringExtra("mes"));
        text3.setText(intent.getStringExtra("rec"));
        NAME.setText(intent.getStringExtra("name"));
        rep.setText(intent.getStringExtra("responsemessage"));
    }

    public void launchSecond(View view){
    Intent intent = new Intent(this,second.class);
    String message = findViewById(R.id.message1).toString();
    editText = findViewById(R.id.message1);
    intent.putExtra("message1",  editText.getText().toString() );
        startActivity(intent);
    }


}