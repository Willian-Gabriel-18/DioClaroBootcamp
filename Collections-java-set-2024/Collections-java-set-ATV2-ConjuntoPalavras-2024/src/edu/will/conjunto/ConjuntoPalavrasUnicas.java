package edu.will.conjunto;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas(){
        palavrasUnicas = new HashSet<>();
    }

    /*
    *adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
    *removerPalavra(String palavra): Remove uma palavra do conjunto.
    *verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
    *exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.
    */

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){
            if(palavrasUnicas.contains(palavra)){
                palavrasUnicas.remove(palavra);
            }
            else{
                System.out.println("Essa palavra nao existe nessa lista!");
            }
        }
        else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public void verificarPalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){
            if(palavrasUnicas.contains(palavra)){
                palavrasUnicas.remove(palavra);
            }
            else{
                System.out.println("Essa palavra nao existe nessa lista!");
            }
        }
        else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }

}
