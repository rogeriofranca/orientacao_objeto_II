package com.example.oo.entities_IV;

import java.time.LocalDate;

public class Product {
    private String nome;
    private double preco;          //LINHA 6 A 9 TIPO DO ACESSO, TIPO_DA_VARIAVEL, VARIAVEL.
    private int quantidade;
    private LocalDate dataValidade;

    public Product() { //CONSTRUTOR SEM ARGUMENTOS
    }
    public Product(String nome, double preco, int quantidade, LocalDate dataValidade) {  //CONSTRUTOR COM ARGUMENTOS
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
    }
    public void produtoCadastrado(){
        System.out.println("PRODUTO CADASTRADO OK");
    }
    public void produtoExcluido(){
        System.out.println("PRODUTO EXCLUIDO OK");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome = " + nome +"\n"+
                "preco = " + preco +"\n"+
                "quantidade = " + quantidade +"\n"+
                "dataValidade = " + dataValidade +"\n"+
                '}';
    }
}
