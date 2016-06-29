package com.example.mobilelab5.alexejeci.entidad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.mobilelab5.alexejeci.R;

public class Activity_Pantalla1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__pantalla1);
       String recibido  = getIntent().getStringExtra("mensaje");// se obtine la etiquta qu epusimos en la anterior actividad

        TextView textView = (TextView)findViewById(R.id.textview);// referencia del edit tex
        textView.setText("usted se llama "+""+recibido);



    }


}