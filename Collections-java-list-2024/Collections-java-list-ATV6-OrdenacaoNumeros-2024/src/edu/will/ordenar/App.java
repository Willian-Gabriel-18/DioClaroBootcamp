package edu.will.ordenar;

public class App {
    public static void main(String[] args){
        OrdenacaoNumeros ordemNumeros = new OrdenacaoNumeros();
        ordemNumeros.adicionarNumero(2);
        ordemNumeros.adicionarNumero(0);
        ordemNumeros.adicionarNumero(12);
        ordemNumeros.adicionarNumero(3);
        ordemNumeros.adicionarNumero(1);
        
        System.out.println("\nORDEM ASCENDENTE");
        System.out.println(ordemNumeros.ordenarAscendente());
        System.out.println("\nORDEM DESCENDENTE");
        System.out.println(ordemNumeros.ordenarDescendente());
    }
}
