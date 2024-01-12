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

public class MainActivity14 extends AppCompatActivity {
ImageView img11;
TextView TV11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        img11 =(ImageView) findViewById(R.id.img11);
        TV11 = (TextView) findViewById(R.id.TV11);
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cpm =(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Copy",TV11.getText().toString());
                cpm.setPrimaryClip(clipData);
                Toast.makeText(MainActivity14.this,"Copies",Toast.LENGTH_SHORT).show();

            }
        });
    }
}