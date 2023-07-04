package com.example.oo.entities_II;

import com.example.oo.entities_II.enums.Experiencia;

public class Executavel {
    public static void main(String[] args) {
        Funcionario objeto1 = new Funcionario("Jean", 25, "usa", "Rua IX", "12323232323", "Dev", 3500.22,120,Experiencia.JUNIOR);
        Funcionario objeto2 = new Funcionario("Pedro",55, "brasileira", "rua 55","00888767876", "DEV", 12500.33, 100, Experiencia.SENIOR);
        Funcionario objeto3 = new Funcionario("Ped",54, "brasileira", "rua 50","008880000000", "DEV", 18500.55, 115, Experiencia.PLENO);

  //      Aluno aluno1 = new Aluno("enfermagem","Biologia",80,"Lea", 44, "Africana", "Rua Leão 22", "23456789-03");
//        Aluno aluno2 = new Aluno("Rita", 38, "Portuguesa", "Rua Lisboa","444009888-44","Pedagogia", "Gestão I"100,);
//        Aluno aluno3 = new Aluno("Gil", 33, "Brasileira", "Rua IP192", "55555555-55", "Ciências da Computação", "cc++",90,);

       objeto1.respirar();
       objeto2.getSalario();
       objeto3.getNome();

//       aluno1.getCurso();
//       aluno2.getDisciplina();
//       aluno3.getCargaHoraria();
         System.out.println(objeto2);

    }



}

        /*"Identifique as classes e implemente um programa para a seguinte especificação:
         “O supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma quantidade em estoque.
          Um pedido de um cliente é composto de itens, onde cada item especifica o produto que o cliente deseja e a
          respectiva quantidade. Esse pedido pode ser pago em dinheiro, cheque ou cartão.*/

