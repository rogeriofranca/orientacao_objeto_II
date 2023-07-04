package com.example.oo.entities_V;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro() {
    }

    public Livro(String titulo, String autor, boolean emprestado ) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = true;
    }
    public void emprestarLivro(){
        this.emprestado = true;
    }
    public void devolverLivro(){
        this.emprestado = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo = " + titulo + "\n" +
                "autor = " + autor + "\n" +
                '}';
    }
}
