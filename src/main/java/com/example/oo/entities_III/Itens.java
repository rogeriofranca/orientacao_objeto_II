package com.example.oo.entities_III;

public class Itens {
    private Produto produto;
    private Integer quantidadeProduto;

    public Itens() {
    }

    public Itens(Produto produto, Integer quantidadeProduto) {
        this.produto = produto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public String toString() {
        return "Itens{" +"\n"+
                "produto =" + produto +"\n"+
                "quantidadeProduto =" + quantidadeProduto +"\n"+
                '}';
    }
}
