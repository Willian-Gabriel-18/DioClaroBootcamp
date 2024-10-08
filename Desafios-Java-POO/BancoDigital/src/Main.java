public class Main {
    public static void main(String[] args){
        Banco banco = new Banco("X");

        Cliente cliente = new Cliente("Carlin");
        
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca= new ContaPoupanca(cliente);
    
        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);
        
        cc.depositar(150);
        cc.transferir(40, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
