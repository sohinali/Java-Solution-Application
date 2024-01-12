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

public class MainActivity15 extends AppCompatActivity {
ImageView img12;
TextView TV12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        img12 =(ImageView) findViewById(R.id.img12);
        TV12 = (TextView) findViewById(R.id.TV12);
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cpm =(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Copy",TV12.getText().toString());
                cpm.setPrimaryClip(clipData);
                Toast.makeText(MainActivity15.this,"Copies",Toast.LENGTH_SHORT).show();

            }
        });
    }
}