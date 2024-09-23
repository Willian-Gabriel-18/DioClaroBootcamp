package edu.will.lib;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> biblioteca;

    /*
    *adicionarLivro(String titulo, String autor, int anoPublicacao): Adiciona um livro ao catálogo.
    *pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros encontrados.
    *pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
    *pesquisarPorTitulo(String titulo): Pesquisa livros por título e retorna o primeiro livro encontrado.
    */
    public CatalogoLivros(){
        this.biblioteca = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        biblioteca.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosComMesmoAutor = new ArrayList<>();
        
        if(!biblioteca.isEmpty()){
            for(Livro l: biblioteca){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosComMesmoAutor.add(l);
                }
            }
            return livrosComMesmoAutor;
        }
        else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosNoIntervaloDeTempo = new ArrayList<>();

        if(!this.biblioteca.isEmpty()){
            for(Livro l: biblioteca){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosNoIntervaloDeTempo.add(l);
                }
            }
            return livrosNoIntervaloDeTempo;
        }
        else{
            throw new RuntimeException("A lista está vazia!");
        }

        
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!this.biblioteca.isEmpty()) {
            for(Livro l: biblioteca){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
            return livroPorTitulo;
        }
        else{
            throw new RuntimeException("A lista está vazia!");
        }        

    }
}
