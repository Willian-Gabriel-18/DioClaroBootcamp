package edu.will.agenda;

import java.time.LocalDate;

public class App {
    public static void main(String[] args){
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 11, 11), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2011, 7, 13), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 30), "Evento 3", "Atracao 3");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
