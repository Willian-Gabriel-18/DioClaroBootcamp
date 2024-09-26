package edu.will.cadastro;

public class Produto {
    private String nome;
    private int cod;
    private Double preco;
    private int quantidade;

    
    public Produto(String nome, int cod, Double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return nome;
    }
    public int getCod() {
        return cod;
    }
    public Double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    
}
