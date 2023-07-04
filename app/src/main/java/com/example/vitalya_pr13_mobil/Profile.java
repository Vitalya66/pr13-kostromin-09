package com.example.vitalya_pr13_mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Profile extends AppCompatActivity implements View.OnClickListener {

    ImageView omenu, main, lis, photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        omenu = findViewById(R.id.imageView13);
        main = findViewById(R.id.imageView30);
        lis = findViewById(R.id.imageView31);
        photo = findViewById(R.id.imageView27);

        omenu.setOnClickListener(this);
        main.setOnClickListener(this);
        lis.setOnClickListener(this);
        photo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageView13:
                startActivity(new Intent(this, Menu.class));
                break;
            case R.id.imageView30:
                startActivity(new Intent(this, Main.class));
                break;
            case R.id.imageView31:
                startActivity(new Intent(this, Listen.class));
                break;
            case R.id.imageView27:
                startActivity(new Intent(this, Photo.class));
                break;
        }
    }
}