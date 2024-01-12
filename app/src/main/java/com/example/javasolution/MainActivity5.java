package com.example.javasolution;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    ImageView img2;
    TextView TV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        img2 =(ImageView) findViewById(R.id.img2);
        TV2 = (TextView) findViewById(R.id.TV2);

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cpm =(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Copy",TV2.getText().toString());
                cpm.setPrimaryClip(clipData);
                Toast.makeText(MainActivity5.this,"Copies",Toast.LENGTH_SHORT).show();

            }
        });

    }
}