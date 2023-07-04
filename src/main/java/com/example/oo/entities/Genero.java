package com.example.oo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Genero extends Animal{
    private Enum<Especie>tipo; // UM ATRIBUTO Enum

    public Genero(String nome,Integer idade, Enum<Especie> tipo) {
        super(nome,idade);
        this.tipo = tipo;
    }

    public void voar(){

        System.out.println("voar");
    }
    public void nadar(){

        System.out.println("nadar");
    }
    public void correr(){

        System.out.println("correr");
    }
    public void rastejar(){
        System.out.println("rastejar");
    }
    public void pular(){
        System.out.println("pular");
    }


}
