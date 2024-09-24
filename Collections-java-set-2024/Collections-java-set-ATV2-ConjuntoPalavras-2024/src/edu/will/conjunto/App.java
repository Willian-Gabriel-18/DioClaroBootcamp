package edu.will.conjunto;

public class App {
    public static void main(String[] args){
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();
        conjuntoPalavras.adicionarPalavra("Palavra 1");
        conjuntoPalavras.adicionarPalavra("Palavra 2");
        conjuntoPalavras.adicionarPalavra("Palavra 1");
        conjuntoPalavras.adicionarPalavra("Palavra 3");
        
        conjuntoPalavras.verificarPalavra("Palavra 3");
        conjuntoPalavras.removerPalavra("Palavra 3");
        conjuntoPalavras.removerPalavra("Palavra 10");

        conjuntoPalavras.exibirPalavrasUnicas();
        conjuntoPalavras.verificarPalavra("Palavra 3");
    }
}
