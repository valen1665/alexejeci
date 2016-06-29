package com.example.mobilelab5.alexejeci.entidad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mobilelab5 on 09/04/2016.
 */
public class Anime {

    private String nombre,autor,anio,url;

    public Anime(String nombre, String autor, String anio, String url) {
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

    public static List<Anime> retornarLista(){

        List<Anime> listaAnime = new ArrayList();
        Anime anime1= new Anime("Los Guardianes de la Humanidad","Manel Martin's","2015","http://espanol.free-ebooks.net/2d_covers/large/1449507191.jpg");
        Anime anime2= new Anime("El elemento de los Mundos","Jose Granadillo","2015","https://espanol.free-ebooks.net/2d_covers/large/1425074435.jpg");
        Anime anime3= new Anime("La Máquina del Tiempo","Herbert George Wells","2013","https://espanol.free-ebooks.net/2d_covers/large/1382920066.jpg");
        Anime anime4= new Anime("Mutante","Henry kuttner","2012","https://espanol.free-ebooks.net/2d_covers/large/1353208941.jpg");
        Anime anime5= new Anime("Halo,La caida de Reach","Eric Nylun","2012","https://espanol.free-ebooks.net/2d_covers/large/1343498936.jpg");
        Anime anime6= new Anime("Adios Tierra","Álvaro Cotes Córdoba","2012","https://espanol.free-ebooks.net/2d_covers/large/1332260317.jpg");
        Anime anime7= new Anime("No somos los primeros","Andrew Thomas","2013","https://espanol.free-ebooks.net/2d_covers/large/1381884356.jpg");
        Anime anime8= new Anime("El hombre que vino del Este","Claudio Erbin","2012","https://espanol.free-ebooks.net/2d_covers/large/1352764318.jpg");
        listaAnime.add(anime1);
        listaAnime.add(anime2);
        listaAnime.add(anime3);
        listaAnime.add(anime4);
        listaAnime.add(anime5);
        listaAnime.add(anime6);
        listaAnime.add(anime7);
        listaAnime.add(anime8);
        return listaAnime;


    }
}
