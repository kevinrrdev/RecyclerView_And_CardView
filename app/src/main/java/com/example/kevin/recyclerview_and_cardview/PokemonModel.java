package com.example.kevin.recyclerview_and_cardview;

public class PokemonModel {

    private String nombre,tipo;
    private int imgPokemon;

    public PokemonModel() {
    }

    public PokemonModel(String nombre, String tipo, int imgPokemon) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.imgPokemon = imgPokemon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getImgPokemon() {
        return imgPokemon;
    }

    public void setImgPokemon(int imgPokemon) {
        this.imgPokemon = imgPokemon;
    }
}
