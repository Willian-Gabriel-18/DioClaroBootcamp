package edu.will.soma;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros = null;

    public SomaNumeros(){
        numeros = new ArrayList<>();
    }

    //adicionarNumero(int numero): Adiciona um número à lista de números.
    //calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
    //encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
    //encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
    //exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.
    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!numeros.isEmpty()){
            for(int x: numeros){
                soma += x;
            }
            return soma;
        }
        else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public int encontrarMaiorNumero(){
        int maiorNum, aux;

        if(!numeros.isEmpty()){
            for(int i = 0; i < numeros.size()-1; i++){
                for(int c = i+1; c < numeros.size(); c++){
                    if(numeros.get(i) < numeros.get(c)){
                        aux = numeros.get(i);
                        numeros.set(i, numeros.get(c));
                        numeros.set(c, aux);
                    }

                }
            }
            maiorNum = numeros.get(0);
            return maiorNum;
        }
        else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public int encontrarMenorNumero(){
        int menorNum, aux;

        if(!numeros.isEmpty()){
            for(int i = 0; i < numeros.size()-1; i++){
                for(int c = i+1; c < numeros.size(); c++){
                    if(numeros.get(i) > numeros.get(c)){
                        aux = numeros.get(i);
                        numeros.set(i, numeros.get(c));
                        numeros.set(c, aux);
                    }

                }
            }
            menorNum = numeros.get(0);
            return menorNum;
        }
        else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public List<Integer> exibirNumeros(){
        if(!numeros.isEmpty()){
            return numeros;
        }
        else{
            return null;
        }    
    }


}
