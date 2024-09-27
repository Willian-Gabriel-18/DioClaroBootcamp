package edu.will.agenda;

public class App {
    public static void main(String[] args){
        AgendaContatos agendaDeContatos = new AgendaContatos();
        agendaDeContatos.adicionarContato("Nome 1", 12132113);
        agendaDeContatos.adicionarContato("Nome 1", 56113);
        agendaDeContatos.adicionarContato("Nome 2", 56113);
        agendaDeContatos.adicionarContato("Nome 3", 564313);
        agendaDeContatos.adicionarContato("Nome 4", 89213);
        agendaDeContatos.adicionarContato("Nome 5", 9788);

        agendaDeContatos.removerContato("Nome 3");
        
        agendaDeContatos.exibirContatos();

        System.out.println("Imprimindo o numero de acordo com nome no parametro: " + agendaDeContatos.pesquisarPorNome("Nome 2"));

    }
    
    
    
}
