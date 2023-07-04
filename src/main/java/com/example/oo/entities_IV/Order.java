package com.example.oo.entities_IV;

import com.example.oo.entities_III.enums.FormaPagamento;
import com.example.oo.entities_IV.enums.FormaDePagamento;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item>items = new ArrayList<>();
    private Enum<FormaDePagamento>formaDePagamento;
    private double precoTotalPorProduto;
    private double precoTotalCompra;

    public Order() {   //CONSTRUTOR SEM ARGUMENTOS
    }
    public Order(List<Item> items, Enum<FormaDePagamento> formaDePagamento) {
        this.items = items;
        this.formaDePagamento = formaDePagamento;
    }
    public double calcularTotalCompra(double precoTotalPorProduto){
        return this.precoTotalCompra += precoTotalPorProduto;
    }
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Enum<FormaDePagamento> getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(Enum<FormaDePagamento> formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
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
        return "Order{" +"\n"+
                "items = " + items +"\n"+
                "formaDePagamento = " + formaDePagamento +"\n"+
                "precoTotalPorProduto = " + precoTotalPorProduto +"\n"+
                "precoTotalCompra = " + precoTotalCompra +"\n"+
                '}';
    }
}
