package edu.will.livraria;

public class Livro {
    private String titulo;
    private String autor;
    private Double preco;
    
    public Livro(String titulo, String autor, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "{titulo = " + titulo + "}|{autor = " + autor + "}|{preco = " + preco + "}\n";
    }

    
}
