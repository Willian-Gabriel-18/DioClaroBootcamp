package edu.will.ordenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros(){
        numerosList = new ArrayList<>();
    }

    //adicionarNumero(int numero): Adiciona um número à lista.
    //ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
    //ordenarDescendente(): Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosOrdemCrescente = new ArrayList<>(numerosList);

        return numerosOrdemCrescente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosOrdemDecrescente = new ArrayList<>(numerosList);

        return numerosOrdemDecrescente;
    }
}
