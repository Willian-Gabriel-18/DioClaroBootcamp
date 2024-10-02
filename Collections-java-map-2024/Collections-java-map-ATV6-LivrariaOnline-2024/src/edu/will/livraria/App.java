package edu.will.livraria;

public class App {

    public static void main(String[] args){
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        //Os livros abaixo provavelmente não existe, assim como os links, veio tudo da minha cabeça, isso é somente um teste dos meus métodos
        livrariaOnline.adicionarLivro("https://www.amazonmarketplace.com.br/page01", "Alberto e suas teorias", "Einsten, Alberto", 149.89D);
        livrariaOnline.adicionarLivro("https://www.amazonmarketplace.com.br/page02", "betin", "Roberto, Ana", 89.00D);
        livrariaOnline.adicionarLivro("https://www.amazonmarketplace.com.br/page03", "Globo T213", "Paulo", 101.89D);
        livrariaOnline.adicionarLivro("https://www.amazonmarketplace.com.br/page04", "Turma da Monica", "Francisco", 65.21D);
        livrariaOnline.adicionarLivro("https://www.amazonmarketplace.com.br/page05", "TV Daora", "Paulo", 85.50D);

        livrariaOnline.removerLivro("betin");
        System.out.println("Exibindo os livros por preço: ");
        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        System.out.println("\nTestando método exibir livros por autor: \n" + livrariaOnline.pesquisarLivrosPorAutor("Paulo"));
        System.out.println("\nObter livro mais caro: " + livrariaOnline.obterLivroMaisCaro());
        livrariaOnline.exibirLivroMaisBarato();

    }
    
}
