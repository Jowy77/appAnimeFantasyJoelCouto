package com.example.appanimefantasyjoelcouto.modelos;

import androidx.compose.ui.graphics.painter.Painter;

public class JugadorAnimeRepuesto {
    String nombre;
    Painter foto;
    String equipoAnime;
    String[] posiciones = {"PG","SG","SF","PF","C"};
    String puntos;
    String equipoRival;
    String fechaPartido;

    public JugadorAnimeRepuesto(String nombre, Painter foto, String equipoAnime, String puntos, String equipoRival, String fechaPartido) {
        this.nombre = nombre;
        this.foto = foto;
        this.equipoAnime = equipoAnime;
        this.puntos = puntos;
        this.equipoRival = equipoRival;
        this.fechaPartido = fechaPartido;
    }

    public Painter getFoto() {
        return foto;
    }

    public void setFoto(Painter foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipoAnime() {
        return equipoAnime;
    }

    public void setEquipoAnime(String equipoAnime) {
        this.equipoAnime = equipoAnime;
    }

    public String[] getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(String[] posiciones) {
        this.posiciones = posiciones;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public String getEquipoRival() {
        return equipoRival;
    }

    public void setEquipoRival(String equipoRival) {
        this.equipoRival = equipoRival;
    }

    public String getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(String fechaPartido) {
        this.fechaPartido = fechaPartido;
    }
}
