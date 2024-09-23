package edu.will.order;

public class App {
    public static void main(String[] args){
        OrdenacaoPessoas pessoaList = new OrdenacaoPessoas();
        pessoaList.adicionarPessoa("Will", 18, 1.67d);
        pessoaList.adicionarPessoa("Gab", 17, 1.80d);
        pessoaList.adicionarPessoa("Igor", 21, 1.76d);
        pessoaList.adicionarPessoa("Luna", 16, 1.74d);
        pessoaList.adicionarPessoa("Ana", 17, 1.67d);

        System.out.println("\nORDENANDO POR ALTURA: ");
        System.out.println(pessoaList.ordenarPorAltura());
        System.out.println("\nORDENANDO POR IDADE: ");
        System.out.println(pessoaList.ordenarPorIdade());
    }
}
