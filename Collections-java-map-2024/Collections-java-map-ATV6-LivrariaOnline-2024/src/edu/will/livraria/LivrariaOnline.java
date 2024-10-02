package edu.will.livraria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    private Map<String, Livro> livrariaOnline;
    /*
    *adicionarLivro(String link, String titulo, String autor, private double preco): Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
    *removerLivro(String titulo): Remove um livro da livraria, dado o titulo do livro.
    *exibirLivrosOrdenadosPorPreco(): Exibe os livros da livraria em ordem crescente de preço.
    *pesquisarLivrosPorAutor(String autor): Retorna uma lista de todos os livros escritos por um determinado autor.
    *obterLivroMaisCaro(): Retorna o livro mais caro disponível na livraria.
    *exibirLivroMaisBarato(): Retorna o livro mais barato disponível na livraria.
    */
    public LivrariaOnline(){
        this.livrariaOnline = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, Double preco){
        this.livrariaOnline.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        List<String> livrosRemover = new ArrayList<>();
        if(!livrariaOnline.isEmpty()){
            for(Map.Entry<String, Livro> map: livrariaOnline.entrySet()){
                if(map.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    livrosRemover.add(map.getKey());//pegar chaves que serao deletadas
                }
            }
            //deletar as chaves do meu map
            for(String chave: livrosRemover){
                livrariaOnline.remove(chave);
            }
        }
        else{
            throw new RuntimeException("O conjunto map esta vazio!");
        }
    }

    public void exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String,Livro>> listaOrdenadaPorPreco = new ArrayList<>(livrariaOnline.entrySet());
        Map<String, Livro> livrosOrdenadosPreco = new LinkedHashMap<>();

        Collections.sort(listaOrdenadaPorPreco, new ComparatorPreco()); 
        
        for(Map.Entry<String, Livro> map: listaOrdenadaPorPreco){
            livrosOrdenadosPreco.put(map.getKey(), map.getValue());
        }

        System.out.println(livrosOrdenadosPreco.entrySet());
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosPorAutorMap = new LinkedHashMap<>();
        
        if(!livrariaOnline.isEmpty()){
            for(Map.Entry<String,Livro> map: livrariaOnline.entrySet()){
                if(map.getValue().getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutorMap.put(map.getKey(), map.getValue());
                }
            }

            return livrosPorAutorMap;
        }
        else{
            throw new RuntimeException("O conjunto esta vazio");
        }
    }

    public Map<String, Livro> obterLivroMaisCaro(){
        Map<String, Livro> livroMaisCaro = new LinkedHashMap<>();
        Double maisCaro = Double.MIN_VALUE;

        for(Map.Entry<String, Livro> map: livrariaOnline.entrySet()){
            if(map.getValue().getPreco() > maisCaro){

                livroMaisCaro.clear();
                livroMaisCaro.put(map.getKey(), map.getValue());
                
                maisCaro = map.getValue().getPreco();
            }
        }

        return livroMaisCaro;
    }

    public void exibirLivroMaisBarato(){
        Map<String, Livro> conjuntoLivroMaisBarato = new LinkedHashMap<>();
        Double maisBarato = Double.MAX_VALUE;

        for(Map.Entry<String,Livro> map: livrariaOnline.entrySet()){
            if(map.getValue().getPreco() < maisBarato){
                maisBarato = map.getValue().getPreco();
                conjuntoLivroMaisBarato.clear();
                conjuntoLivroMaisBarato.put(map.getKey(), map.getValue());
            }
        }

        if(conjuntoLivroMaisBarato.isEmpty()){
            System.out.println("O conjunto map está vazio!");
            return ;
        }

        System.out.println("O livro mais barato é:\n " + conjuntoLivroMaisBarato);

    }


    public static class ComparatorPreco implements Comparator<Map.Entry<String, Livro>>{

        @Override
        public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
            if(l1.getValue().getPreco() < l2.getValue().getPreco()){
                return -1;
            }
            if(l1.getValue().getPreco() > l2.getValue().getPreco()){
                return 1;
            }
            return 0;
        }
    }
}


