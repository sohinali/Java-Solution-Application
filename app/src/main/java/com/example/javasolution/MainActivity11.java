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

public class MainActivity11 extends AppCompatActivity {
ImageView img8;
TextView TV8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        img8 =(ImageView) findViewById(R.id.img8);
        TV8 = (TextView) findViewById(R.id.TV8);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cpm =(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Copy",TV8.getText().toString());
                cpm.setPrimaryClip(clipData);
                Toast.makeText(MainActivity11.this,"Copies",Toast.LENGTH_SHORT).show();

            }
        });
    }
}