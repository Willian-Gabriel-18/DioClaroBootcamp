package edu.will.dicionario;

public class App {
    public static void main(String[] args){
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Carro", "Carro significa... ");
        dicionario.adicionarPalavra("Moto", "Moto significa... ");
        dicionario.adicionarPalavra("Bicicleta", "Bicicleta significa... ");
        dicionario.adicionarPalavra("Moto", "Moto significa bla... ");
        
        dicionario.removerPalavra("Moto");

        dicionario.exibirPalavras();

        System.out.println("Definicao da palavra escolhida como parametro: " + dicionario.pesquisarPorPalavra("Bicicleta"));
    }
}
