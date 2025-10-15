public class App {
    public static void main(String[] args) throws Exception {
        // Exercicio dos veiculos
        Veiculo[] veiculos = new Veiculo[] {
            new Carro("Toyota", "Corolla", 4),
            new Moto("Honda", "CB500", 500),
            new Carro("Volkswagen", "Gol", 4),
            new Moto("Yamaha", "MT-07", 689)
        };

        for (Veiculo v : veiculos) {
            v.exibirInfo();
            System.out.println("--------------------");
        }

        // Teste da classe Funcionario
        Funcionario func = new Funcionario(
            "Ana", 30, 'F', "RH", true, "Rua A, 123", "(11) 99999-0000"
        );

        // Ajusta créditos e dívidas e valida saldo
        func.setValorCredito(1000);
        func.setValorDivida(200);
        func.getSaldo(); // Deve imprimir 800
        boolean testeSaldo = (func.getValorCredito() - func.getValorDivida()) == 800;

        // Muda trabalho para false e valida estado
        func.mudarTrabalho(false);
        boolean testeTrabalho = !func.isTrabalhando();

        if (testeSaldo && testeTrabalho) {
            System.out.println("Teste Funcionario: OK");
        } else {
            System.out.println("Teste Funcionario: FALHOU");
            if (!testeSaldo) System.out.println(" - Saldo não confere.");
            if (!testeTrabalho) System.out.println(" - Estado trabalhando não confere.");
        }

    }
}
