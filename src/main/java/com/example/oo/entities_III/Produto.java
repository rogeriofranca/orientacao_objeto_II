package com.example.oo.entities_III;

import java.time.LocalDate;

public class Produto {
    private String nome;
    private double preco;
    private Integer quantidade;
    private LocalDate dataValidade;

    public Produto() {
    }

    public Produto(String nome, double preco, Integer quantidade, LocalDate dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
    }
    public void cadastrarProduto() {
        System.out.println("PRODUTO CADASTRADO");
    }
    public void excluirProduto() {
        System.out.println("PRODUTO EXCLUIDO");
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

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
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
        return "Produto{" +"\n"+
                "nome = " + nome +"\n"+
                "preco = " + preco +"\n"+
                "quantidade = " + quantidade +"\n"+
                "dataValidade = " + dataValidade +"\n"+
                '}';
    }
}
