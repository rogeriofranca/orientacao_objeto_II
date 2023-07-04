package com.example.oo.entities_III;
/*"Identifique as classes e implemente um programa para a seguinte especificação:
 *“O supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma quantidade em estoque.
 *Um pedido de um cliente é composto de itens, onde cada item especifica o produto que o cliente deseja e a
 *respectiva quantidade. Esse pedido pode ser pago em dinheiro, cheque ou cartão.*/

import com.example.oo.entities_III.enums.FormaPagamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mercado {
    public static void main(String[] args) {
        Produto produto1 = new Produto("SABONETE",1.99, 30, LocalDate.of(2023,6,27));
        Produto produto2 = new Produto("ESCOVA DENTAL",2.50, 10, LocalDate.of(2023, 6, 10));
        Produto produto3 = new Produto("CREME DENTAL", 3.01, 20, LocalDate.of(2023,4,10));
        Produto produto4 = new Produto("SAL", 2.99, 40, LocalDate.of(2023,4,10));
        Produto produto5 = new Produto("AÇUCAR", 4.45, 32, LocalDate.of(2023, 10, 20));
        Produto produto6 = new Produto("ARROZ",19.50, 50, LocalDate.of(2023, 07, 22));
        Produto produto7 = new Produto("FEIJÂO", 5.99, 20, LocalDate.of(2023, 2, 3));
        Produto produto8 = new Produto("PIZZA", 22.19, 10, LocalDate.of(2023, 3, 13));
        Produto produto9 = new Produto("BANANA",5.89, 20, LocalDate.of(2023, 12, 22));
        Produto produto10 = new Produto("SABÂO EM Pò", 18.22, 22, LocalDate.of(2023, 12,30));

        Itens iten1 = new Itens(produto10,1);
        Itens iten2 = new Itens(produto1,2);
        Itens iten3 = new Itens(produto2,1);
        Itens iten4 = new Itens(produto3,2);
        Itens iten5 = new Itens(produto4,2);

        Pedido pedido1 = new Pedido(List.of(iten1, iten2, iten3, iten4, iten5), FormaPagamento.DINHEIRO);
        System.out.println(pedido1);

        List<String>nomes = new ArrayList<>();
        nomes.add("Rogerio");
        nomes.add("Franca");
        nomes.add("jean");
        System.out.println(nomes);

        List<Double>preco =new ArrayList<>();
        preco.add(111.00);
        preco.add(222.01);
        System.out.println(preco);

        nomes.remove("jean");
        System.out.println(nomes);

    }

}
