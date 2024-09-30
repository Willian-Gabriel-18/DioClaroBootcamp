package edu.will.contagem;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;
    
    public ContagemPalavras(){
        palavrasMap = new HashMap<>();
    }

    /*
    *adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
    *removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
    *exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
    *encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
     */

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!palavrasMap.isEmpty()){
            palavrasMap.remove(palavra);
        }   
        else{
            throw new RuntimeException("O conjunto map esta vazio!");
        }
    }

    public void exibirContagemPalavras(){
        int contTotal = 0;
        if(!palavrasMap.isEmpty()){
            for(String s: palavrasMap.keySet()){
                System.out.println("Produto: " + s + " - Qtd: " + palavrasMap.get(s));
                contTotal += palavrasMap.get(s);
            }
            System.out.println("Total de palavras: " + contTotal);
        }   
        else{
            throw new RuntimeException("O conjunto map esta vazio!");
        }
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        for(String s: palavrasMap.keySet()){
            if(maiorContagem < palavrasMap.get(s)){
                maiorContagem = palavrasMap.get(s);
                palavraMaisFrequente = s + " - " + maiorContagem;
            }
        }

        return palavraMaisFrequente;
    }
}
