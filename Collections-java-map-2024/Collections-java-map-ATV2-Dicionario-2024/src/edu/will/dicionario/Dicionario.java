package edu.will.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> conjuntoDicionario;
    
    public Dicionario(){
        conjuntoDicionario = new HashMap<>();
    }

    /*
    *adicionarPalavra(String palavra, String definicao): Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
    *removerPalavra(String palavra): Remove uma palavra do dicionário, dado o termo a ser removido.
    *exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
    *pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
    */

    public void adicionarPalavra(String palavra, String definicao){
        conjuntoDicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!conjuntoDicionario.isEmpty()){
            conjuntoDicionario.remove(palavra);
        }
        else{
            throw new RuntimeException("O conjunto esta vazio!");
        }
    }

    public void exibirPalavras(){
        if(!conjuntoDicionario.isEmpty()){
            System.out.println(conjuntoDicionario);
        }
        else{
            throw new RuntimeException("O conjunto esta vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String descricao;
        if(!conjuntoDicionario.isEmpty()){
            descricao = conjuntoDicionario.get(palavra);
            return descricao;
        }
        else{
            throw new RuntimeException("O conjunto esta vazio!");
        }
    }
    
}
