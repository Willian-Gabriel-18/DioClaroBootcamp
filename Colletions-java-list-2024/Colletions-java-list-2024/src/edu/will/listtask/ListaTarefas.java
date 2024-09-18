package edu.will.listtask;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaDeTarefas;
    
    public ListaTarefas(){
        this.listaDeTarefas = new ArrayList<>();
    }

    
    public void adicionarTarefa(String descricao){
        this.listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : listaDeTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        listaDeTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricoesTarefas(){
        for(Tarefa t: listaDeTarefas)
            System.out.println("["+t+"]");
    }   
}
