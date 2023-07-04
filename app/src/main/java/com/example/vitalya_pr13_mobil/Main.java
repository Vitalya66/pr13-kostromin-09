package com.example.vitalya_pr13_mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Main extends AppCompatActivity implements View.OnClickListener {

    ImageView st1,st2,st3, st4, omenu, lis, prof;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        st1 = findViewById(R.id.imageView14);
        st2 = findViewById(R.id.imageView15);
        st3 = findViewById(R.id.imageView16);
        st4 = findViewById(R.id.imageView11);
        omenu = findViewById(R.id.imageView3);
        lis = findViewById(R.id.imageView22);
        prof = findViewById(R.id.imageView23);

        st1.setOnClickListener(this);
        st2.setOnClickListener(this);
        st3.setOnClickListener(this);
        st4.setOnClickListener(this);
        omenu.setOnClickListener(this);
        lis.setOnClickListener(this);
        prof.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageView14:
                Toast.makeText(this, "Взволнованным", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageView15:
                Toast.makeText(this, "Спокойным", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageView16:
                Toast.makeText(this, "Сосредоточеным", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageView11:
                Toast.makeText(this, "Расслабленным", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageView3:
                startActivity(new Intent(this, Menu.class));
                break;
            case R.id.imageView22:
                startActivity(new Intent(this, Listen.class));
                break;
            case R.id.imageView23:
                startActivity(new Intent(this, Profile.class));
                break;
        }
    }
}