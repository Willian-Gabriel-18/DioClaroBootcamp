package edu.will.dio.desafio.dominio;

public abstract class Conteudo {
    final double XP_PADRAO = 10D;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public double getXP_PADRAO() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }    
}
