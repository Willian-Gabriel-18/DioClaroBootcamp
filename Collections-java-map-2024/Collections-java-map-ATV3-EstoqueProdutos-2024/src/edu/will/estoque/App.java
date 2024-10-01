package edu.will.estoque;

public class App {
    public static void main(String[] args){
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(3231L, "Produto 1", 2, 32.91d);
        estoqueProdutos.adicionarProduto(0021L, "Produto 4", 12, 50.12d);
        estoqueProdutos.adicionarProduto(3674L, "Produto 3", 11, 19.02d);
        estoqueProdutos.adicionarProduto(1930L, "Produto 6", 7, 6.86d);
        estoqueProdutos.adicionarProduto(6473L, "Produto 2", 17, 45.4d);
        estoqueProdutos.adicionarProduto(1293L, "Produto 5", 1, 123.25d);

        System.out.println("Testando metodo exibirProdutos(): ");
        estoqueProdutos.exibirProdutos();

        System.out.println("Testando metodo calcularValorTotalEstoque(): " + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: \n" + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: \n" + estoqueProdutos.obterProdutoMaisBarato());

        System.out.println("Testando metodo obterProdutoMaiorQuantidadeValorTotalNoEstoque(): " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}
