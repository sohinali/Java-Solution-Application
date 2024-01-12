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

public class MainActivity12 extends AppCompatActivity {
ImageView img9;
TextView TV9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        img9 =(ImageView) findViewById(R.id.img9);
        TV9 = (TextView) findViewById(R.id.TV9);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cpm =(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Copy",TV9.getText().toString());
                cpm.setPrimaryClip(clipData);
                Toast.makeText(MainActivity12.this,"Copies",Toast.LENGTH_SHORT).show();

            }
        });
    }
}