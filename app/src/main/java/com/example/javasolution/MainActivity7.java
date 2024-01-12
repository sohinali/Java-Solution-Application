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

public class MainActivity7 extends AppCompatActivity {
    ImageView img4;
    TextView TV4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        img4 =(ImageView) findViewById(R.id.img4);
        TV4 = (TextView) findViewById(R.id.TV4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cpm =(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Copy",TV4.getText().toString());
                cpm.setPrimaryClip(clipData);
                Toast.makeText(MainActivity7.this,"Copies",Toast.LENGTH_SHORT).show();

            }
        });

    }
}