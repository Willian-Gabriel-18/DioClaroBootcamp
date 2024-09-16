package edu.will.servico;

import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        System.out.printf("Serviço a ser verificado: ");
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        System.out.printf("Nome cliente e serviços contratados: ");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        //Verificar se o serviço está na lista de serviços contratados
        for(String p : partes){
            if(p.trim().equals(servico)){
              contratado = true;
              break;
            }
        }
          
        if(contratado == true){
        System.out.println("Sim");
        }else{
        System.out.println("Nao");
        }

        scanner.close();
    }
}