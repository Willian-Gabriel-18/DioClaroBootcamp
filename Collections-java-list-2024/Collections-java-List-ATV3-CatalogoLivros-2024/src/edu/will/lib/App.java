package edu.will.lib;

public class App {
    public static void main(String[] args){
        // Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2017);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2025);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 3", 2030);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 4", 2001);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2005);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2007);

        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println("\nEXIBINDO LIVROS POR AUTOR");
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 3"));

        //Exibindo livros por intervalo de tempo
        System.out.println("\nEXIBINDO LIVROS POR INTERVALO DE TEMPO");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2010));

        //Exibindo livro por Titulo
        System.out.println("\nEXIBINDO LIVRO POR TITULO");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 2"));

        
        

    }

    

}
