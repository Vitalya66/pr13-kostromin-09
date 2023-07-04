package com.example.vitalya_pr13_mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    EditText email,pass;
    TextView btn_reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
        btn_reg = findViewById(R.id.textView6);
        btn_reg.setOnClickListener(this);

        email = findViewById(R.id.editTextTextEmailAddress);
        pass = findViewById(R.id.editTextTextPassword);
    }

    @Override
    public void onClick(View v) {
        String tlog = "";
        String tpass = "";

        tlog = email.getText().toString();
        tpass = pass.getText().toString();
            switch (v.getId()){
                case R.id.button:
                    if (!tlog.isEmpty() || !tpass.isEmpty()){
                        startActivity(new Intent(this, Main.class));
                    }else{
                        Toast.makeText(this, "Заполните поля", Toast.LENGTH_LONG).show();
                    }
                    break;
                case R.id.textView6:
                    startActivity(new Intent(this, Register.class));
                    break;
            }
    }
}