package com.example.mobilelab5.alexejeci.adaptador;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mobilelab5.alexejeci.R;
import com.example.mobilelab5.alexejeci.entidad.Anime;
import com.example.mobilelab5.alexejeci.entidad.Romance;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Valen on 28/06/2016.
 */
public class Adaptador_romance extends BaseAdapter{
    List<Romance> listaromance;
    Context context;
    public Adaptador_romance(Context contexto1){
        listaromance=Romance.retornarLista();
        context=contexto1;

    }

    @Override
    public int getCount() {
        return listaromance.size();
    }

    @Override
    public Object getItem(int position) {
        return listaromance.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = null;
        if(convertView==null){
            v=View.inflate(context, R.layout.anme_item,null);
        }else{
            v=convertView;
        }
        TextView textAnime=(TextView) v.findViewById(R.id.text_nombre);
        textAnime.setText(listaromance.get(position).getNombre());
        TextView textanime1=(TextView) v.findViewById(R.id.text_autor);
        textanime1.setText(listaromance.get(position).getAutor());
        TextView textanime2 =(TextView) v.findViewById(R.id.text_anio);
        textanime2.setText(listaromance.get(position).getAnio());
        ImageView imageView =(ImageView) v.findViewById(R.id.imagen);


        Picasso.with(context).load(listaromance.get(position).getUrl()).resize(300,500).into(imageView);
        return v;
    }
}


