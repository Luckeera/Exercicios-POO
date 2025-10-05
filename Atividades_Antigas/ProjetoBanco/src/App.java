public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        conta1.numeroConta = "12345";
        conta2.numeroConta = "67890";
        conta1.titular = "João Silva";
        conta2.titular = "Maria Oliveira";
        conta1.saldo = 1000.0;
        conta2.saldo = 500.0;
        
        conta1.depositar(200.0);
        conta1.sacar(150.0);
        conta1.consultarSaldo();

        conta2.depositar(300.0);
        conta2.sacar(600.0);
        conta2.consultarSaldo();
        
    }
}
