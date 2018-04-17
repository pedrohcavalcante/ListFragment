package com.example.pedro.listfragment;

/**
 * Created by pedro on 17/04/2018.
 */

public class Alimento {

    private String nome;
    private double preco;

    @Override
    public String toString() {
        return this.nome;
    }

    public Alimento(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
