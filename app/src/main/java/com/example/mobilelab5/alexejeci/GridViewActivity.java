package com.example.mobilelab5.alexejeci;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mobilelab5.alexejeci.adaptador.Adaptador_anime;

public class GridViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        GridView gridView = (GridView) findViewById(R.id.gridview);
        Adaptador_anime adaptador_grid = new Adaptador_anime(this);

        gridView.setAdapter(adaptador_grid);

        TextView textView = (TextView)findViewById(R.id.texto);
        registerForContextMenu(textView);
        registerForContextMenu(gridView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflador = getMenuInflater();
        inflador.inflate(R.menu.chat_menus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.favoritos:
                Toast.makeText(this,"hola como estas",Toast.LENGTH_LONG).show();
                Log.d("menu", "usted selecciono favoritos");


                break;

            case R.id.actualizar:
                Toast.makeText(this,"usted selecciona actualizar",Toast.LENGTH_LONG).show();
                Log.d("menu", "usted selecciono favoritos");

                break;

            case R.id.agregar:
                Toast.makeText(this,"usted selecciona agregar",Toast.LENGTH_LONG).show();
                Log.d("menu", "usted selecciono agregar");

                break;

            case R.id.buscar:
                Toast.makeText(this,"usted selecciona buscar",Toast.LENGTH_LONG).show();
                Log.d("menu", "usted selecciono buscar");

                break;
            case R.id.submenu:
                Toast.makeText(this,"usted selecciona submenu",Toast.LENGTH_LONG).show();
                Log.d("menu", "usted selecciono el submenu");

                break;


        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflador = getMenuInflater();
        inflador.inflate(R.menu.chat_menus, menu);

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.favoritos:
                Toast.makeText(this,"hola como estas",Toast.LENGTH_LONG).show();
                Log.d("menu", "usted selecciono favoritos");


                break;

            case R.id.actualizar:
                Toast.makeText(this,"usted selecciona actualizar",Toast.LENGTH_LONG).show();
                Log.d("menu", "usted selecciono favoritos");

                break;

            case R.id.agregar:
                Toast.makeText(this,"usted selecciona agregar",Toast.LENGTH_LONG).show();
                Log.d("menu", "usted selecciono agregar");

                break;

            case R.id.buscar:
                Toast.makeText(this,"usted selecciona buscar",Toast.LENGTH_LONG).show();
                Log.d("menu", "usted selecciono buscar");
                createAlertDialog();

                break;
            case R.id.submenu:
                Toast.makeText(this,"usted selecciona submenu",Toast.LENGTH_LONG).show();
                Log.d("menu", "usted selecciono el submenu");

                break;


        }


            return super.onContextItemSelected(item);

        }


    public void createAlertDialog(){
        AlertDialog.Builder builder = new  AlertDialog.Builder(this);
        builder.setTitle("advertencia de seguridad");
        builder.setMessage("esta seguro");
        builder.setPositiveButton("aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(GridViewActivity.this, "usted acepto", Toast.LENGTH_LONG).show();

            }
        });

   builder.setNegativeButton("cancelar", new DialogInterface.OnClickListener() {
       @Override
       public void onClick(DialogInterface dialog, int which) {
           Toast.makeText(GridViewActivity.this, "usted cancelo", Toast.LENGTH_LONG).show();

       }
   });
     builder.show();

    }


}