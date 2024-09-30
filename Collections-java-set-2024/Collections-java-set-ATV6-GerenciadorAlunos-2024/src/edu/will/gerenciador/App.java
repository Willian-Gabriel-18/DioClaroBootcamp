package edu.will.gerenciador;

public class App {
    public static void main(String[] args){
        GerenciadorAlunos sistemaAlunos = new GerenciadorAlunos();

        //sistemaAlunos.exibirAlunos();
        //sistemaAlunos.exibirAlunosPorNome();
        //sistemaAlunos.exibirAlunosPorNota();

        sistemaAlunos.adicionarAluno("Leonardo", 2022313L, 6D);
        sistemaAlunos.adicionarAluno("Lionel", 2021001L, 8d);
        sistemaAlunos.adicionarAluno("Ana", 2024435L, 3d);
        sistemaAlunos.adicionarAluno("Yara", 2023313L, 10d);
        sistemaAlunos.adicionarAluno("Bia", 2020140L, 7d);

        sistemaAlunos.removerAluno(2022313L);
        
        System.out.println("Exibindo alunos por nota: ");
        sistemaAlunos.exibirAlunosPorNota();
        System.out.println("Exibindo alunos por nome: ");
        sistemaAlunos.exibirAlunosPorNome();
        System.out.println("Exibindo alunos: ");
        sistemaAlunos.exibirAlunos();
    }
}
