package edu.will.gerenciador;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private Long matricula;
    private Double media;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    public Aluno(String nome, Long matricula, Double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public Double getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    

    @Override
    public String toString() {
        return "\nAluno\n{nome = " + nome + "}\n{matricula = " + matricula + "}\n{media = " + media + "}\n";
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.nome);//uma maneira interessante de pegar o nome do meu objeto e comparar aos demais
    }
}
