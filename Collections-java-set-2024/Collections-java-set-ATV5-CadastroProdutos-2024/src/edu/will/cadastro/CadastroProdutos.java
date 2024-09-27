package edu.will.cadastro;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> cadastroProduto;

    public CadastroProdutos(){
        cadastroProduto = new HashSet<>();
    }

    /*
    *adicionarProduto(long cod, String nome, double preco, int quantidade): Adiciona um produto ao cadastro.
    *exibirProdutosPorNome(): Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
    *exibirProdutosPorPreco(): Exibe todos os produtos do cadastro em ordem crescente de preço.
    */

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        cadastroProduto.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(cadastroProduto);

        return produtosPorNome;
    }
    
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!cadastroProduto.isEmpty()) {
            produtosPorPreco.addAll(cadastroProduto);
            return produtosPorPreco;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    
}
