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

public class MainActivity10 extends AppCompatActivity {
    ImageView img7;
    TextView TV7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        img7 =(ImageView) findViewById(R.id.img7);
        TV7 = (TextView) findViewById(R.id.TV7);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cpm =(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Copy",TV7.getText().toString());
                cpm.setPrimaryClip(clipData);
                Toast.makeText(MainActivity10.this,"Copies",Toast.LENGTH_SHORT).show();

            }
        });



    }
}