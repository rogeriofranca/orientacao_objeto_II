package com.example.oo;

import com.example.oo.entities_V.Emprestimo;
import com.example.oo.entities_V.Livro;
import com.example.oo.entities_V.Pessoa;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

public class Executavel {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
            Pessoa pessoa1 = new Pessoa("João", 25);
            Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis",true);
            Livro livro2 = new Livro("JFK", "Jean",true);
            Livro livro3 = new Livro("O Mito", "Bolsonaro",true);
            Livro livro4 = new Livro("O Mito1", "Michelle",true);
            Livro livro5 = new Livro("O Mito2", "Assis",true);

            Emprestimo emprestimo1 = new Emprestimo(List.of(livro1,livro5), pessoa1, calendar.getTime());
           // livro1.emprestarLivro();
//            System.out.println("Livros emprestado: " +emprestimo1.getLivros());
//            System.out.println("Data de empréstimo: " +emprestimo1.getDataEmprestimo());

          //  emprestimo1.devolverLivro(calendar.getTime());
            //livro1.devolverLivro();
            //System.out.println("Livro devolvido: " + livro1.getTitulo());
            //System.out.println("Data de devolução: " + emprestimo1.getDataDevolucao());

            Pessoa pessoa2 = new Pessoa("Jean",35);
            Emprestimo emprestimo2 = new Emprestimo(List.of(livro2, livro3, livro4), pessoa2, calendar.getTime());
            System.out.println(emprestimo2);
            emprestimo2.excluirLivro(livro4,emprestimo2.getLivros());
            System.out.println(emprestimo2);
        }
    }
