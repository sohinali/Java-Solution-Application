package com.example.javasolution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity8 extends AppCompatActivity {
ImageView img5;
TextView TV5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        img5 =(ImageView) findViewById(R.id.img5);
        TV5 = (TextView) findViewById(R.id.TV5);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cpm =(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Copy",TV5.getText().toString());
                cpm.setPrimaryClip(clipData);
                Toast.makeText(MainActivity8.this,"Copies",Toast.LENGTH_SHORT).show();

            }
        });


    }
}