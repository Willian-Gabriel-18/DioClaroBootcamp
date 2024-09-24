package edu.will.soma;

public class App {
    
    public static void main(String[] args){
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(0);
        System.out.println("Maior numero: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor numero: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Exibir numeros: " + somaNumeros.exibirNumeros());
    }
    
}
