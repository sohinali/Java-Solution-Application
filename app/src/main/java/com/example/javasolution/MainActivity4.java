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

public class MainActivity4 extends AppCompatActivity {
    ImageView img1;
    TextView TV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        img1 =(ImageView) findViewById(R.id.img1);
        TV1 = (TextView) findViewById(R.id.TV1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cpm =(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Copy",TV1.getText().toString());
                cpm.setPrimaryClip(clipData);
                Toast.makeText(MainActivity4.this,"Copies",Toast.LENGTH_SHORT).show();

            }
        });


    }
}