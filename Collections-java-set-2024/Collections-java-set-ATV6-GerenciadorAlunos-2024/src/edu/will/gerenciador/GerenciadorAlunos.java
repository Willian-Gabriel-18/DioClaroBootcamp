package edu.will.gerenciador;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> listaAlunos;

    public GerenciadorAlunos(){
        listaAlunos = new HashSet<>();
    }

    /*
    *adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
    *removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
    *exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
    *exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
    exibirAlunos(): Exibe todos os alunos do conjunto.
    */

    public void adicionarAluno(String nome, Long matricula, double media){
        listaAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoRemovido = null;

        if(!listaAlunos.isEmpty()){
            for(Aluno a: listaAlunos){
                if(a.getMatricula() == matricula){
                    alunoRemovido = a;
                    break;
                }
            }

            listaAlunos.remove(alunoRemovido);
        }
        else{
            throw new RuntimeException("O conjunto esta vazio!");
        }

        if(alunoRemovido == null){
            System.out.println("Aluno nao encontrado!");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> setOrdemCrescenteNome = new TreeSet<>(listaAlunos);
        if(!listaAlunos.isEmpty()){
           System.out.println(setOrdemCrescenteNome);
        }
        else{
            throw new RuntimeException("O conjunto esta vazio!");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> setOrdemCrescenteNota = new TreeSet<>(new ComparadorPorNota());//colocar um objeto da classe ComparadorPorNota faz com que ele receba meus objetos de forma organizada pela classe ComparadorPorNota

        if(!listaAlunos.isEmpty()){
            setOrdemCrescenteNota.addAll(listaAlunos);
            System.out.println(setOrdemCrescenteNota);
        }
        else{
            throw new RuntimeException("O conjunto esta vazio!");
        }
    }

    public void exibirAlunos(){
        if(!listaAlunos.isEmpty()){
            System.out.println(listaAlunos);
        }
        else{
            throw new RuntimeException("O conjunto esta vazio!");
        }
    }

    public static class ComparadorPorNota implements Comparator<Aluno>{
        @Override
        public int compare(Aluno a1, Aluno a2) {
            if(a1.getMedia() < a2.getMedia()){
                return -1;
            }
            if(a1.getMedia() > a2.getMedia()){
                return 1;
            }
            return 0;
        }
    }
}
