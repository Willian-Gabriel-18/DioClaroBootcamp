package edu.will.iphone;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    //Metodos ReprodutorMusical
    public void  tocar() {
        System.out.println("Tocando musica!");
    }
    public void pausar(){
        System.out.println("Pausando musica!");
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionando a musica: " + musica);
    }

    //Metodos AparelhoTelefonico
    public void ligar(String numero){
        System.out.println("Ligando para o numero " + numero);

    }
    public void atender(){
        System.out.println("Atendendo ligação");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciar correio de voz");
    }

    //Metodos NavegadorInternet
    public void exibirPagina(String url){
        System.out.println("Exibindo Pagina de url: " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionar nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }
}
