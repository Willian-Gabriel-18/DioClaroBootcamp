package edu.will.listtask;
public class App {
    public static void main(){
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Task 1");
        lista.adicionarTarefa("Task 2");
        lista.adicionarTarefa("Task 1");
        lista.adicionarTarefa("Task 3");

        lista.removerTarefa("Task 1");
        System.out.println("O numero de tarefas adicionadas é: " + lista.obterNumeroTotalTarefas());

        lista.obterDescricoesTarefas();

    }
    
}
