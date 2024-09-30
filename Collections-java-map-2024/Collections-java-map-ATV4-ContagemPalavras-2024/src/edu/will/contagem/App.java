package edu.will.contagem;

public class App {
    public static void main(String[] args){
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Carlos", 3);
        contagemPalavras.adicionarPalavra("Aldeido", 19);
        contagemPalavras.adicionarPalavra("Ana", 0);
        contagemPalavras.adicionarPalavra("Gilberto", 5);
        contagemPalavras.adicionarPalavra("Bia", 11);
        contagemPalavras.adicionarPalavra("Gianna", 27);

        System.out.println("Imprimindo o conjunto map: ");
        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("Carlos");

        System.out.println("Imprimindo o conjunto map com um valor definido removido: ");
        contagemPalavras.exibirContagemPalavras();

        System.out.println("\nPalavra mais frequente: " + contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
