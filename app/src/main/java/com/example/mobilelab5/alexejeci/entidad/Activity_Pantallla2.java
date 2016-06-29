package com.example.mobilelab5.alexejeci.entidad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mobilelab5.alexejeci.Activity_camara;
import com.example.mobilelab5.alexejeci.R;

public class Activity_Pantallla2 extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__pantallla2);

        editText = (EditText)findViewById(R.id.edittext);
        Button button =(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Activity_Pantallla2.this,Activity_Pantalla1.class);
                Bundle datos = new Bundle();
                datos.putString("mensaje",editText.getText().toString());
                intent.putExtras(datos);

                startActivity(intent);
            }
        });

        Button button1 =(Button)findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Activity_Pantallla2.this, Activity_pantalla3.class);

                startActivityForResult(intent, 0, null);


            }
        });

        Button button2 =(Button)findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Activity_Pantallla2.this, Activity_camara.class);

                startActivityForResult(intent, 0, null);


            }
        });





    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode ==0 && resultCode == 0){
          String  respuesta =  data.getStringExtra("respuesta1");
            editText.setText(respuesta);
        }

    }
}
