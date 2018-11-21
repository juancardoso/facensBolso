package com.example.juan.facensbolso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = (Button) findViewById(R.id.btlogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tlogin = (TextView) findViewById(R.id.tlogin);
                TextView tsenha = (TextView) findViewById(R.id.tsenha);
                String login = tlogin.getText().toString();
                String senha = tlogin.getText().toString();
                if(login.equals("teste") && senha.equals("teste")){
                    alert("Login realizado com sucesso");
                    Intent intentHome = new Intent(getApplicationContext(),Home.class);
                    startActivity(intentHome);
                }else{
                    alert("Login ou senha incorretos");
                }
            }
        });
    }

    private void alert(String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }
}
