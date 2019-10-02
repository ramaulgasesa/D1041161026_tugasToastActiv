package com.example.d1041161026_tugastoastactiv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    int mCount = 26;
    TextView mShowCount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        final TextView textView = findViewById(R.id.text_header);
        textView.setText(message);
        final TextView textCount = findViewById(R.id.showCount);
        textCount.setText(Integer.toString(mCount));
        final Button buttonTambah = findViewById(R.id.btnTambah);
        buttonTambah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mCount++;
                textCount.setText(Integer.toString(mCount));
            }
        });
        final Button buttonKurang = findViewById(R.id.btnKurang);
        buttonKurang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mCount--;
                textCount.setText(Integer.toString(mCount));
            }
        });

    }

}
