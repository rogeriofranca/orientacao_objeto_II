package com.example.oo.entities_III;

import com.example.oo.entities_III.enums.FormaPagamento;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Itens>itens = new ArrayList<>();

    private Enum<FormaPagamento>formaPagamento;
    private double precoTotalPorProduto;
    private double precoTotalCompra;

   public Pedido() {    //CONTRUTOR SEM ARGUMENTOS
    }

    public Pedido(List<Itens> itens, Enum<FormaPagamento> formaPagamento) { //CONSTRUTOR COM ARGUMENTOS
        this.itens = itens;
        this.formaPagamento = formaPagamento;
    }
    public double calcularTotalCompra(double precoTotalPorProduto){
        return this.precoTotalCompra += precoTotalPorProduto;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }

    public Enum<FormaPagamento> getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Enum<FormaPagamento> formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getPrecoTotalPorProduto() {
        return precoTotalPorProduto;
    }

    public void setPrecoTotalPorProduto(double precoTotalPorProduto) {
        this.precoTotalPorProduto = precoTotalPorProduto;
    }

    public double getPrecoTotalCompra() {
        return precoTotalCompra;
    }

    public void setPrecoTotalCompra(double precoTotalCompra) {
        this.precoTotalCompra = precoTotalCompra;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "itens = " + itens +"\n"+
                "formaPagamento = " + formaPagamento +"\n"+
                "precoTotalPorProduto = " + precoTotalPorProduto +"\n"+
                "precoTotalCompra = " + precoTotalCompra +"\n"+
                '}';
    }
}
