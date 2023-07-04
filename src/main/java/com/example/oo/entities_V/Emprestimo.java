package com.example.oo.entities_V;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emprestimo {
    private List<Livro> livros = new ArrayList<>();
    private Pessoa pessoa;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo() {
    }

    public Emprestimo(List<Livro> livros, Pessoa pessoa, Date dataEmprestimo) {
        this.livros = livros;
        this.pessoa = pessoa;
        this.dataEmprestimo = dataEmprestimo;
    }


    public List<Livro> getLivros() {
        return livros;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void devolverLivro(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public List<Livro> excluirLivro(Livro livro, List<Livro> minhaLista) {
        boolean temLivro = minhaLista.contains(livro);
        if (temLivro) {
            minhaLista.remove(livro);
        } else {
            System.out.println("O Livro Não Existe Em Sua Lista");
        }
        return minhaLista;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "livros=" + livros +
                ", pessoa=" + pessoa +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}
