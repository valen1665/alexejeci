package com.example.mobilelab5.alexejeci.entidad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mobilelab5.alexejeci.R;

public class Activity_pantalla3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_pantalla3);

        final EditText edittext = (EditText)findViewById(R.id.edittext3);
        Button button =(Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("respuesta1",edittext.getText().toString());
                Intent intent = getIntent();
                intent.putExtra("respuesta","a");
                intent.putExtras(bundle);
                setResult(0,intent);
                finish();

            }

        });
    }




}
