package desafio.dio.banco;

public class Main {
    public static void main(String[] args) {
        Cliente ycaro = new Cliente();
        ycaro.setNome("Ycaro");

        Conta cc = new ContaCorrente(ycaro);
        Conta cp = new ContaPoupanca(ycaro);

        cc.depositar(100);
        cc.sacar(50);
        cc.transferir(48, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
