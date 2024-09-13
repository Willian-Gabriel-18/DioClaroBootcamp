package edu.will.banco;

import java.util.Scanner;

public class ContaTerminal {
    
    public static String nomeCliente;
    public static String agencia;
    public static int numero;
    public static double saldo;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*
         * Atribuindo valores pelo terminal:
         * nomeCliente = args[0];
         * agencia = args[1];
         * numero = Integer.valueOf(args[2]);
         * saldo = Double.valueOf(args[3]);
         * 
        */

        System.out.printf("Digite o nome do cliente: ");
        nomeCliente = sc.nextLine();
        System.out.printf("Digite a agencia do cliente: ");
        agencia = sc.nextLine();
        System.out.printf("Digite o numero da agencia do cliente: ");
        numero = sc.nextInt();
        System.out.printf("Digite o saldo do cliente: ");
        saldo = sc.nextDouble(); 

        System.out.printf("%nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",nomeCliente, agencia, numero, saldo);

        sc.close();
    }
}
