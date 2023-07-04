package com.example.vitalya_pr13_mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OnBoarding extends AppCompatActivity implements View.OnClickListener {

    Button btn_login;
    TextView btn_reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);
        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this);
        btn_reg = findViewById(R.id.button_reg);
        btn_reg.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:
                startActivity(new Intent(this, Login.class));
                break;
            case R.id.button_reg:
                startActivity(new Intent(this, Register.class));
                break;
        }
    }
}