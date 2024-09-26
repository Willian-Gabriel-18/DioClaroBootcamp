package edu.will.lista;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefa;

    public ListaTarefas(){
        listaTarefa = new HashSet<>();
    }
    /*
    *adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
    *removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
    *exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
    *contarTarefas(): Conta o número total de tarefas na lista de tarefas.
    *obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
    *obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
    *marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.
    *marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
    *limparListaTarefas(): Remove todas as tarefas da lista de tarefas.
    */

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }


    public void removerTarefa(String descricao){
        Tarefa tarefaRemovida = null;
        if(!listaTarefa.isEmpty()){
            for(Tarefa t: listaTarefa){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaRemovida = t;
                    break;
                }
            }
            listaTarefa.remove(tarefaRemovida);
        }
        else{
            throw new RuntimeException("A lista esta vazia!");
        }

        if(tarefaRemovida == null){
            System.out.println("Tarefa nao encontra!");
        }
    }

    public void exibirTarefas(){
        if(!listaTarefa.isEmpty()){
            System.out.println(listaTarefa);
        }
        else{
            System.out.println("A lista esta vazia!");
        }
    }

    public int contarTarefas(){
        return listaTarefa.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t: listaTarefa){
            if(t.isConcluido()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t: listaTarefa){
            if(!t.isConcluido()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t: listaTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluido(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa t: listaTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                if(t.isConcluido()){
                    t.setConcluido(false);
                }               
            }    
        }
    }   

    

}
