package com.example.mobilelab5.alexejeci.adaptador;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mobilelab5.alexejeci.R;
import com.example.mobilelab5.alexejeci.entidad.Anime;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Mobilelab5 on 09/04/2016.
 */
public class Adaptador_anime extends BaseAdapter {

    List<Anime> listaanime;
     Context context;
    public Adaptador_anime(Context contexto1){
        listaanime=Anime.retornarLista();
        context=contexto1;

    }

    @Override
    public int getCount() {
        return listaanime.size();
    }

    @Override
    public Object getItem(int position) {
        return listaanime.get(position);
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
        textAnime.setText(listaanime.get(position).getNombre());
        TextView textanime1=(TextView) v.findViewById(R.id.text_autor);
        textanime1.setText(listaanime.get(position).getAutor());
        TextView textanime2 =(TextView) v.findViewById(R.id.text_anio);
        textanime2.setText(listaanime.get(position).getAnio());
        ImageView imageView =(ImageView) v.findViewById(R.id.imagen);


        Picasso.with(context).load(listaanime.get(position).getUrl()).resize(300,500).into(imageView);
        return v;
    }
}
