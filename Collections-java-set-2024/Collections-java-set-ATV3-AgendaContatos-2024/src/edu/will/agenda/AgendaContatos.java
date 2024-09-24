package edu.will.agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agendaContatos;

    public AgendaContatos(){
        agendaContatos = new HashSet<>();
    }
    /*
    *adicionarContato(String nome, int numero): Adiciona um contato à agenda.
    *exibirContatos(): Exibe todos os contatos da agenda.
    *pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
    *atualizarNumeroContato(String nome, int novoNumero): Atualiza o número de telefone de um contato específico.
    */

    public void adicionarContato(String nome, int numero){
        agendaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        if(!agendaContatos.isEmpty()){
            System.out.println(agendaContatos);
        }
        else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> listaPorNome = new HashSet<>();
        if(!agendaContatos.isEmpty()){
            for(Contato o: agendaContatos){
                if(o.getNome().startsWith(nome)){
                    listaPorNome.add(o);
                }
            }
        }   
        else{
            throw new RuntimeException("A lista esta vazia!");
        }
        return listaPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato numeroAtualizado = null;
        if(!agendaContatos.isEmpty()){
            for(Contato c: agendaContatos){
                //Verificar se o nome sao iguais primeiro
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumeroTelefone(novoNumero);
                    numeroAtualizado = c;
                    return numeroAtualizado;
                }
            }
            return null;
        }   
        else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }
}
