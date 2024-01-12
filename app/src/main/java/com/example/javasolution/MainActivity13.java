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

public class MainActivity13 extends AppCompatActivity {
    ImageView img10;
    TextView TV10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        img10 =(ImageView) findViewById(R.id.img10);
        TV10 = (TextView) findViewById(R.id.TV10);
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cpm =(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Copy",TV10.getText().toString());
                cpm.setPrimaryClip(clipData);
                Toast.makeText(MainActivity13.this,"Copies",Toast.LENGTH_SHORT).show();

            }
        });
    }
}