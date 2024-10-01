package edu.will.estoque;

public class Produto {
    private String nome;
    private int quantidade;
    private Double preco;

    public Produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "\nProduto\n{nome = " + nome + "}\n{quantidade = " + quantidade + "}\n{preco = " + preco + "}\n\n";
    }    

    
    
}
