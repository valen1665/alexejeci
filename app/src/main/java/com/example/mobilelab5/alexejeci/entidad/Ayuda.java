package com.example.mobilelab5.alexejeci.entidad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valen on 28/06/2016.
 */
public class Ayuda {
    private String nombre,autor,anio,url;

    public Ayuda(String nombre, String autor, String anio, String url) {
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

    public static List<Ayuda> retornarLista(){

        List<Ayuda> listaAyuda = new ArrayList();
        Ayuda ayuda1= new Ayuda("El elixir de la salud","Arnaldo Matero","2013","https://espanol.free-ebooks.net/2d_covers/large/1379861902.jpg");
        Ayuda ayuda2= new Ayuda("El valor de las de las de las Decisiones","Jaime Balmes","2013","https://espanol.free-ebooks.net/2d_covers/large/1370245881.jpg");
        Ayuda ayuda3= new Ayuda("Los colores de la vida","Lidda Campos","2015","https://espanol.free-ebooks.net/2d_covers/large/1435270359.jpg");
        Ayuda ayuda4= new Ayuda("La Guia del Viajero","Guillermo Salazar","2014","https://espanol.free-ebooks.net/2d_covers/large/1414434210.jpg");
        Ayuda ayuda5= new Ayuda("Diario de un Superviviente","Jordi Luque","2014","https://espanol.free-ebooks.net/2d_covers/large/1390311656.jpg");
        Ayuda ayuda6= new Ayuda("El arte de Amar","Eric Fromm","2012","https://espanol.free-ebooks.net/2d_covers/large/1335131326.jpg");
        Ayuda ayuda7= new Ayuda("Aprendiendo a Quererse a si mismo","Walter Riso","2012","https://espanol.free-ebooks.net/2d_covers/large/1340831541.jpg");
        Ayuda ayuda8= new Ayuda("Padre Rico,Padre Pobre","Robert Kiyosaki","2014","https://espanol.free-ebooks.net/2d_covers/large/1392162617.jpg");
        listaAyuda.add(ayuda1);
        listaAyuda.add(ayuda2);
        listaAyuda.add(ayuda3);
        listaAyuda.add(ayuda4);
        listaAyuda.add(ayuda5);
        listaAyuda.add(ayuda6);
        listaAyuda.add(ayuda7);
        listaAyuda.add(ayuda8);
        return listaAyuda;


    }

}
