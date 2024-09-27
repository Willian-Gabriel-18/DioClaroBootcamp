package edu.will.cadastro;

public class App {
    public static void main(String[] args){
        CadastroProdutos produtosSet = new CadastroProdutos();
        produtosSet.adicionarProduto(2L, "Produto 1", 15d, 5);
        produtosSet.adicionarProduto(1L, "Produto 0", 20d, 10);
        produtosSet.adicionarProduto(3L, "Produto 2", 7.5d, 8);
        produtosSet.adicionarProduto(4L, "Produto 3", 3.2d, 9);

        System.out.println("Conjunto: ");
        System.out.println(produtosSet.cadastroProduto);

        System.out.println("Conjunto em ordem por nome:");
        System.out.println(produtosSet.exibirProdutosPorNome());

        System.out.println("Conjunto em ordem por preco:");
        System.out.println(produtosSet.exibirProdutosPorPreco());
        
    }
}
