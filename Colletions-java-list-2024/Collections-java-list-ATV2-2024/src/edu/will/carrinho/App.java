package edu.will.carrinho;

public class App {
    public static void main(String[] args){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Item 1", 10, 15);
        carrinho.adicionarItem("Item 2", 50, 8);
        carrinho.adicionarItem("Item 1", 5, 1);
        carrinho.adicionarItem("Item 3", 2, 1);
        carrinho.adicionarItem("Item 4", 4, 4);
        carrinho.adicionarItem("Item 5", 3, 3);

        System.out.println("ValorTotal: " + carrinho.calcularValorTotal());
        carrinho.removerItem("Item 1");
        carrinho.removerItem("Item 3");
        carrinho.removerItem("Item 3");

        System.out.println("ValorTotal: " + carrinho.calcularValorTotal());
        carrinho.exibirItens();
        
    }
}
