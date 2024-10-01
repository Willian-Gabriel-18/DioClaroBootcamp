package edu.will.agenda;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }
    /*
    *adicionarEvento(LocalDate data, String nome, String atracao): Adiciona um evento à agenda.
    *exibirAgenda(): Exibe a agenda de eventos em ordem crescente de data.
    *obterProximoEvento(): Retorna o próximo evento que ocorrerá.
    */

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosOrganizados = new TreeMap<>(eventosMap);

        System.out.println(eventosOrganizados);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();

        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosOrganizados = new TreeMap<>(eventosMap);

        for(Map.Entry<LocalDate, Evento> mapa: eventosOrganizados.entrySet()){
            if(mapa.getKey().isEqual(dataAtual) || mapa.getKey().isAfter(dataAtual)){
                proximaData = mapa.getKey();
                proximoEvento = mapa.getValue();

                System.out.println("O proximo evento: " + proximoEvento + " acontecera na data " + proximaData);
                break;
            }
        }
    }
}
