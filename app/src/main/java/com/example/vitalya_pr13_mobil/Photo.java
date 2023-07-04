package com.example.vitalya_pr13_mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Photo extends AppCompatActivity implements View.OnClickListener {

    TextView close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        close = findViewById(R.id.textView14);
        close.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textView14:
                startActivity(new Intent(this, Profile.class));
                break;
        }
    }
}