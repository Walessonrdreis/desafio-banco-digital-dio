package digitalinnovation.banco;

public class Main {
    public static void main(String[] args) {
        Cliente walesson = new Cliente();
        walesson.setNome("Walesson");




        Conta cc = new ContaCorrente(walesson);
        cc.depositar(200);
        Conta poupanca = new ContaPoupanca(walesson);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
