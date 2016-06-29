package com.example.mobilelab5.alexejeci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.mobilelab5.alexejeci.adaptador.Adaptador_autoayuda;
import com.example.mobilelab5.alexejeci.adaptador.Adaptador_romance;

public class View_selectedtres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_selectedtres);

        ListView listView= (ListView)findViewById(R.id.lista3);
        Adaptador_autoayuda adaptador_autoayuda =new Adaptador_autoayuda(this);
        listView.setAdapter(adaptador_autoayuda);
}
}
