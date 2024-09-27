package edu.will.cadastro;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private String nome;
    private long cod;
    private Double preco;
    private int quantidade;

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public Produto(String nome, long cod, Double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return nome;
    }
    public long getCod() {
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
        return "\nProduto[{nome = " + nome + "} | {cod = " + cod + "} preco = " + preco + "} | {quantidade = " + quantidade + "}]";
    }
    
}

class ComparatorPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2){
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
