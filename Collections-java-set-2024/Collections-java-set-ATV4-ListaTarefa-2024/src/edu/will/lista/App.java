package edu.will.lista;

public class App {
    public static void main(String[] args){
        ListaTarefas listaDeTarefas = new ListaTarefas();

        listaDeTarefas.adicionarTarefa("Descricao 1");
        listaDeTarefas.adicionarTarefa("Descricao 2");
        listaDeTarefas.adicionarTarefa("Descricao 1");
        listaDeTarefas.adicionarTarefa("Descricao 3");
        listaDeTarefas.adicionarTarefa("Descricao 4");
        listaDeTarefas.adicionarTarefa("Descricao 5");

        listaDeTarefas.exibirTarefas();
        listaDeTarefas.removerTarefa("Descricao 2");
        listaDeTarefas.removerTarefa("Descricao 20");

        System.out.println("Lista de tarefas apos remover: ");
        listaDeTarefas.exibirTarefas();
        
        listaDeTarefas.marcarTarefaConcluida("Descricao 1");
        listaDeTarefas.marcarTarefaConcluida("Descricao 2");
        listaDeTarefas.marcarTarefaConcluida("Descricao 5");
        System.out.println("Lista de tarefas apos marcar algumas como concluidas: ");
        listaDeTarefas.exibirTarefas();

        listaDeTarefas.marcarTarefaPendente("Descricao 2");
        listaDeTarefas.marcarTarefaPendente("Descricao 9");
        System.out.println("Lista de tarefas apos marcar algumas como pendente: ");
        listaDeTarefas.exibirTarefas();
    }
}
