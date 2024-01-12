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

public class MainActivity16 extends AppCompatActivity {
ImageView img13;
TextView TV13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        img13 =(ImageView) findViewById(R.id.img13);
        TV13 = (TextView) findViewById(R.id.TV13);
        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cpm =(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Copy",TV13.getText().toString());
                cpm.setPrimaryClip(clipData);
                Toast.makeText(MainActivity16.this,"Copies",Toast.LENGTH_SHORT).show();

            }
        });
    }
}