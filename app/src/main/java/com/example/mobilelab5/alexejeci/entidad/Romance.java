package com.example.mobilelab5.alexejeci.entidad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valen on 28/06/2016.
 */
public class Romance {
    private String nombre,autor,anio,url;

    public Romance(String nombre, String autor, String anio, String url) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
        this.url = url;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static List<Romance> retornarLista(){

        List<Romance> listaRomance = new ArrayList();
        Romance romance1= new Romance("Un viaje y un Encuentro","Lorena Uhart","2015","http://espanol.free-ebooks.net/2d_covers/large/1424634955.jpg");
        Romance romance2= new Romance("Los ángeles también lloran","Concepción Liébana","2013","http://espanol.free-ebooks.net/2d_covers/large/1371245266.jpg");
        Romance romance3= new Romance("Deseo y traición","Heidi Betts","2013","http://espanol.free-ebooks.net/2d_covers/large/1380568276.jpg");
        Romance romance4= new Romance("Orgullo y Prejuicio","Jane Austin","2011","http://espanol.free-ebooks.net/2d_covers/large/1318553832.jpg");
        Romance romance5= new Romance("Dulces Mentiras","Jude Deveraux","2013","http://espanol.free-ebooks.net/2d_covers/large/1382237869.jpg");
        Romance romance6= new Romance("Terremoto de Pasiones","Maya Blake","2013","http://espanol.free-ebooks.net/2d_covers/large/1380672497.jpg");
        Romance romance7= new Romance("Amor en Secreto","Hellen B.","2013","http://espanol.free-ebooks.net/2d_covers/large/1379712863.jpg");
        Romance romance8= new Romance("101 ideas Romanticas","Esperanza Cruz","2012","http://espanol.free-ebooks.net/2d_covers/large/1350310194.jpg");
        listaRomance.add(romance1);
        listaRomance.add(romance2);
        listaRomance.add(romance3);
        listaRomance.add(romance4);
        listaRomance.add(romance5);
        listaRomance.add(romance6);
        listaRomance.add(romance7);
        listaRomance.add(romance8);
        return listaRomance;


    }
}


