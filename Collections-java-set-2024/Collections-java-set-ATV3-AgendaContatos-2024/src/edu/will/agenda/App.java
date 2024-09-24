package edu.will.agenda;

public class App {
    public static void main(String[] args){
        AgendaContatos agendaDeContatos= new AgendaContatos();
        
        agendaDeContatos.adicionarContato("Luix",162133);
        agendaDeContatos.adicionarContato("Gabriela",34322423);
        agendaDeContatos.adicionarContato("Diego",452133);
        agendaDeContatos.adicionarContato("Luna",67565);
        agendaDeContatos.exibirContatos();

        agendaDeContatos.atualizarNumeroContato("Gabriela", 100001);
        agendaDeContatos.exibirContatos();
    }
}
