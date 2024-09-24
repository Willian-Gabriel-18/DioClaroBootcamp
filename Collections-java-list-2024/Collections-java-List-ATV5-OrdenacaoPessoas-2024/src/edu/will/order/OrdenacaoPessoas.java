package edu.will.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoas(){
        pessoasList = new ArrayList<>();
    }
    
    //adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à lista.
    //ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.
    //ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado.

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasOrdenadasPorIdade = new ArrayList<>(pessoasList);
        if(!pessoasList.isEmpty()){
            Collections.sort(pessoasOrdenadasPorIdade);
            return pessoasOrdenadasPorIdade;
        }
        else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasOrdenadasPorAltura = new ArrayList<>(pessoasList);
        if(!pessoasList.isEmpty()){
            Collections.sort(pessoasOrdenadasPorAltura, new ComparatorPorAltura());
            return pessoasOrdenadasPorAltura;
        }
        else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }


}
