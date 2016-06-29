package com.example.mobilelab5.alexejeci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mobilelab5.alexejeci.adaptador.Adaptador_anime;
import com.example.mobilelab5.alexejeci.adaptador.Adaptador_romance;

public class View_Selected extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__selected);

        ListView listView1= (ListView)findViewById(R.id.lista1);
        Adaptador_romance adaptador_romance =new Adaptador_romance(this);
        listView1.setAdapter(adaptador_romance);
    }
}
