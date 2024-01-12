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

public class MainActivity9 extends AppCompatActivity {
    ImageView img6;
    TextView TV6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        img6 =(ImageView) findViewById(R.id.img6);
        TV6 = (TextView) findViewById(R.id.TV6);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cpm =(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Copy",TV6.getText().toString());
                cpm.setPrimaryClip(clipData);
                Toast.makeText(MainActivity9.this,"Copies",Toast.LENGTH_SHORT).show();

            }
        });
    }
}