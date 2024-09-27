package edu.will.agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContato;

    public AgendaContatos(){
        this.agendaContato = new HashMap<>();
    }

    /*
    *adicionarContato(String nome, Integer telefone): Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
    *removerContato(String nome): Remove um contato da agenda, dado o nome do contato.
    *exibirContatos(): Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
    *pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
    */
    public void adicionarContato(String nome, Integer telefone){
        this.agendaContato.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContato.isEmpty()){
            this.agendaContato.remove(nome);
        }
        else{
            throw new RuntimeException("O conjunto esta vazio!");
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContato);
    }

    public Integer pesquisarPorNome(String nome){
        int numeroTelefone;
        if(!agendaContato.isEmpty()){  
            numeroTelefone = this.agendaContato.get(nome);
            return numeroTelefone;
        }
        else{
            throw new RuntimeException("O conjunto esta vazio!");
        }
    }

}
