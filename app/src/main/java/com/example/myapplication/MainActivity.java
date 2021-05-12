package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_logar;
    EditText nome, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.nomeUsuario);
        password = findViewById(R.id.passwordUsuario);
        btn_logar = findViewById(R.id.btn_logar);

        btn_logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _nome = nome.getText().toString();
                String nome_ = _nome.toUpperCase();
                String _password = password.getText().toString();
                if(_password.length() >0 && _nome.length() > 0){

                    if(_password == "pass" && nome_ == "USER"){
                    Intent intent_ = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent_);
                    }
                    else{
                        Intent _intent = new Intent(MainActivity.this,MainActivity3.class);
                        startActivity(_intent);
                    }
                }
                else{
                    Toast.makeText(MainActivity.this,"Preencha o formulário",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}