package edu.will.lista;

public class Tarefa {
    private String descricao;
    private boolean concluido;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    @Override
    public String toString() {
        return " Tarefa[{descricao = " + descricao + "} & {concluido = " + concluido + "}]\n";
    }
}
