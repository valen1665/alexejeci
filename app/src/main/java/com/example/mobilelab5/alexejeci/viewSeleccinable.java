package com.example.mobilelab5.alexejeci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.mobilelab5.alexejeci.adaptador.Adaptador_anime;
import com.example.mobilelab5.alexejeci.adaptador.Adaptador_romance;

import java.lang.reflect.Array;

public class viewSeleccinable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_seleccinable);

        ListView listView = (ListView) findViewById(R.id.lista);

        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.Autocompletado);
        Spinner spinner = (Spinner) findViewById(R.id.spiner);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String[] arregloPeliculas = getResources().getStringArray(R.array.peliculas);
                Log.d("lista", "ud seleccion" + arregloPeliculas[position]);

            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] arregloPeliculas = getResources().getStringArray(R.array.peliculas);
                Log.d("spiner", "ud seleccion" + arregloPeliculas[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        String[] arreglo={"natalia","michel","alex","luis","mauricio"};
        ArrayAdapter adaptadorDefault = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arreglo);
        ArrayAdapter adaptadorPersonalarray = new ArrayAdapter(this,R.layout.adaptador1,R.id.text1,arreglo);

        Adaptador_anime adaptador_anime =new Adaptador_anime(this);
        listView.setAdapter(adaptador_anime);
        spinner.setAdapter(adaptadorPersonalarray);
        autoCompleteTextView.setAdapter(adaptadorDefault);


    }
}