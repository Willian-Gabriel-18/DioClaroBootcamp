package edu.will.order;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private Double altura;
    
    public Pessoa(String nome, int idade, Double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa p) {
        // TODO Auto-generated method stub
        return Integer.compare(idade, p.getIdade());
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "\nPessoa = \n\t+{nome=" + nome + "}\n\t+{idade=" + idade + "}\n\t+{altura=" + altura + "}\n";
    }    
}


class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

}