package com.example.mylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText userEditText;
    EditText passEditText;

    String name = "cv5";
    String pass = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userEditText = findViewById(R.id.user);
        passEditText = findViewById(R.id.pass);


    }


    public void entrar(View view) {

        String u = userEditText.getText().toString();
        String p = passEditText.getText().toString();
        if( name.equals(u) && pass.equals(p) ){

            Toast.makeText(MainActivity.this,"Usuario correcto",Toast.LENGTH_LONG).show();

            Intent i;
            i = new Intent(MainActivity.this,Listado.class);
            startActivity(i);

        }else {


            Toast.makeText(MainActivity.this, "Usuario incorrecto", Toast.LENGTH_LONG).show();

        }
    }
}
