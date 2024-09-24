package edu.will.conjunto;

public class App {
    
    public static void main(String[] args){
        int code = 1000;
        ConjuntoConvidados listaConvidados = new ConjuntoConvidados();
    
        listaConvidados.adicionarConvidado("Luan", 1001);
        listaConvidados.adicionarConvidado("Gab", 1000);
        listaConvidados.adicionarConvidado("Carla", 1231);

        System.out.println("Existe " + listaConvidados.contarConvidados() + " convidados na lista.");
        System.out.println("Lista de convidados agora: ");
        listaConvidados.exibirConvidados();
        listaConvidados.removerConvidadoPorCodigoConvite(code);
        System.out.println("Removi o convidado de codigo [" + code + "] da lista, agora a lista tem [" + listaConvidados.contarConvidados() + "] convidados.");
        System.out.println("Lista de convidados agora: ");
        listaConvidados.exibirConvidados();
        
        
    }
    
}
