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


public class MainActivity6 extends AppCompatActivity {
    ImageView img3;
    TextView TV3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        img3 =(ImageView) findViewById(R.id.img3);
        TV3 = (TextView) findViewById(R.id.TV3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cpm =(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Copy",TV3.getText().toString());
                cpm.setPrimaryClip(clipData);
                Toast.makeText(MainActivity6.this,"Copies",Toast.LENGTH_SHORT).show();

            }
        });

    }
}