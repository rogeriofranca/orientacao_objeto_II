package com.example.oo.entities_IV;

public class Item {
    private Product product;      // TIPO DE ACESSO, TIPO DE VARIAVEL, VARIAVEL
    private int quantidadeProduto;

    public Item() {        //CONSTRUTOR SEM ARGUMENTOS
    }

    public Item(Product product, int quantidadeProduto) {  //CONSTRUTOR COM ARGUMENTOS
        this.product = product;
        this.quantidadeProduto = quantidadeProduto;
    }

    public Product getProduct() {     //LINHA 15 A 29 GETTER SETTER
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public String toString() {
        return "Items{" +"\n"+                     //LINHA 31 A 37  TOSTRING
                "product = " + product +"\n"+
                "quantidadeProduto = " + quantidadeProduto +"\n"+
                '}';
    }
}
