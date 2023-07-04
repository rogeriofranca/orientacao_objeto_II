package com.example.oo.entities_IV;

import com.example.oo.entities_IV.enums.FormaDePagamento;

import java.time.LocalDate;
import java.util.List;

public class Marketplace {
    public static void main(String[] args) {
        Product product11 = new Product("BATATA",4.44, 400, LocalDate.of(2023,10,20));
        Product product12 = new Product("HAMBURGUER",12.50,230,LocalDate.of(2023,11,23));
        Product product13 = new Product("PÃO PLUS VITA",8.59,67,LocalDate.of(2023,4,16));
        Product product14 = new Product("MARGARINA", 7.99, 100, LocalDate.of(2023,12,27));
        Product product15 = new Product("FILE DE PEIXE", 13.40, 98, LocalDate.of(2023,4, 18));

        Item item1 = new  Item(product11,14);
        Item item2 = new Item(product12,10);
        Item item3 = new Item(product13,22);
        Item item4 = new Item(product14,5);
        Item item5 = new Item(product15,3);

        Order order1 = new Order(List.of(item1, item2, item3, item4, item5), FormaDePagamento.PIX);
        System.out.println(order1);

        Order order2 = new Order(List.of(item1,item2),FormaDePagamento.DINHEIRO);
        System.out.println(order2);
    }

}
