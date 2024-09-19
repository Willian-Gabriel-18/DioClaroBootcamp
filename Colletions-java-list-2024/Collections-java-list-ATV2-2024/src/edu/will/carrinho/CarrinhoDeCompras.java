package edu.will.carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras{
    List<Item> itens;

    public CarrinhoDeCompras(){
        itens = new ArrayList<>();
    }
    /*
     *adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
     *removerItem(String nome): Remove um item do carrinho com base no seu nome.
     *calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
     *exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
     */
    public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        /*
         * List<Item> remover = new ArrayList<>();
         * for(Item i: itens){
         *  if(i.getNome().equalsIgnoreCase(nome)){
         *      remover.add(i);
         *  }
         * }
         * itens.removeAll(remover);
         */           

        for(int i = 0; i < itens.size(); i++){
            if(itens.get(i).getNome().equalsIgnoreCase(nome)){
                if(itens.get(i).getQuantidade() != 0){
                    itens.get(i).setQuantidade(itens.get(i).getQuantidade()-1);
                    break;
                }
                else{
                    itens.remove(i);
                    break;
                }
            }
        }
        
    }

    public Double calcularValorTotal(){
        Double valorTotal = 0.0;
        for(Item i: itens){
            valorTotal += i.getPreco()*i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        for(Item i:itens){
            System.out.println("[ Nome: " + i.getNome() + " - Preco: " + i.getPreco() + " - " +  i.getQuantidade() + " ]");
        }
    }
}
