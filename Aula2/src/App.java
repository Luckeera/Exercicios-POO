import java.util.Scanner;
public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEscolha um exercicio (1 a 16) ou 0 para sair:");
            System.out.println("1 - Maior de dois numeros");
            System.out.println("2 - Media de dois numeros");
            System.out.println("3 - Media de 3 notas");
            System.out.println("4 - Positivo, negativo ou zero");
            System.out.println("5 - Fatorial");
            System.out.println("6 - Pode votar");
            System.out.println("7 - Numero primo");
            System.out.println("8 - Conversor de temperatura");
            System.out.println("9 - Media salarial");
            System.out.println("10 - Promocao de loja");
            System.out.println("11 - Categoria de nadador");
            System.out.println("12 - Sistema bancario");
            System.out.println("13 - Numeros decrescentes");
            System.out.println("14 - Valores menores que 10");
            System.out.println("15 - Numeros pares de 1 a 50");
            System.out.println("16 - Soma de numeros pares");
            System.out.print("Opcao: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1: maiorNumero(); break;
                case 2: mediaDoisNumeros(); break;
                case 3: mediaNotas(); break;
                case 4: verificarNumero(); break;
                case 5: fatorial(); break;
                case 6: podeVotar(); break;
                case 7: numeroPrimo(); break;
                case 8: conversorTemperatura(); break;
                case 9: mediaSalarial(); break;
                case 10: promocaoLoja(); break;
                case 11: categoriaNadador(); break;
                case 12: sistemaBancario(); break;
                case 13: numerosDecrescentes(); break;
                case 14: valoresMenoresQueDez(); break;
                case 15: numerosPares(); break;
                case 16: somaPares(); break;
                default: System.out.println("Opcao invalida!");
            }
        }
        scanner.close();
    }

    // 1 - Maior de dois numeros
    public static void maiorNumero() {
        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();
        if (num1 > num2) {
            System.out.println("O maior numero e: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior numero e: " + num2);
        } else {
            System.out.println("Os numeros sao iguais.");
        }
    }

    // 2 - Media de dois numeros
    public static void mediaDoisNumeros() {
        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();
        double media = (num1 + num2) / 2;
        System.out.println("A media entre " + num1 + " e " + num2 + " e: " + media);
    }

    // 3 - Media de 3 notas
    public static void mediaNotas() {
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A media das notas e: %.2f%n", media);
        if (media >= 7.0) {
            System.out.println("Aluno APROVADO!");
        } else {
            System.out.println("Aluno REPROVADO!");
        }
    }

    // 4 - Positivo, negativo ou zero
    public static void verificarNumero() {
        System.out.print("Digite um numero: ");
        double num = scanner.nextDouble();
        if (num > 0) {
            System.out.println("O numero " + num + " e POSITIVO.");
        } else if (num < 0) {
            System.out.println("O numero " + num + " e NEGATIVO.");
        } else {
            System.out.println("O numero e ZERO.");
        }
    }

    // 5 - Fatorial
    public static void fatorial() {
        System.out.print("Digite um numero inteiro >= 0 para calcular o fatorial: ");
        int numero = scanner.nextInt();
        if (numero < 0) {
            System.out.println("Numero invalido! O fatorial so e definido para numeros >= 0.");
        } else {
            long resultado = 1;
            for (int i = 2; i <= numero; i++) {
                resultado *= i;
            }
            System.out.println("O fatorial de " + numero + " e: " + resultado);
        }
    }

    // 6 - Pode votar
    public static void podeVotar() {
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade >= 16) {
            System.out.println("Voce pode votar!");
        } else {
            System.out.println("Voce ainda nao pode votar.");
        }
    }

    // 7 - Numero primo
    public static void numeroPrimo() {
        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();
        boolean primo = true;
        if (numero <= 1) primo = false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println(numero + " e um numero primo!");
        } else {
            System.out.println(numero + " nao e um numero primo.");
        }
    }

    // 8 - Conversor de temperatura
    public static void conversorTemperatura() {
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;
        double reaumur = celsius * 0.8;
        double rankine = celsius * 1.8 + 32 + 459.67;
        System.out.printf("Temperatura em Fahrenheit: %.2f F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);
        System.out.printf("Temperatura em Reaumur: %.2f Re%n", reaumur);
        System.out.printf("Temperatura em Rankine: %.2f Ra%n", rankine);
    }

    // 9 - Media salarial
    public static void mediaSalarial() {
        double somaSalarios = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite o salario do funcionario " + i + ": R$ ");
            double salario = scanner.nextDouble();
            somaSalarios += salario;
        }
        double media = somaSalarios / 4;
        System.out.printf("A media salarial dos 4 funcionarios e: R$ %.2f%n", media);
    }

    // 10 - Promocao de loja
    public static void promocaoLoja() {
        System.out.print("Digite o valor do produto: R$ ");
        double valor = scanner.nextDouble();
        if (valor > 200) {
            double desconto = valor * 0.15;
            valor -= desconto;
            System.out.printf("Desconto de 15%% aplicado! Valor com desconto: R$ %.2f%n", valor);
        }
        double prestacao = valor / 5;
        System.out.printf("Valor de cada prestacao (5x sem juros): R$ %.2f%n", prestacao);
    }

    // 11 - Categoria de nadador
    public static void categoriaNadador() {
        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();
        if (idade <= 7) {
            System.out.println("Categoria: Infantil A");
        } else if (idade <= 10) {
            System.out.println("Categoria: Infantil B");
        } else if (idade <= 13) {
            System.out.println("Categoria: Juvenil A");
        } else if (idade <= 17) {
            System.out.println("Categoria: Juvenil B");
        } else {
            System.out.println("Categoria: Senior");
        }
    }

    // 12 - Sistema bancario
    public static void sistemaBancario() {
        double saldo = 1000.0;
        while (true) {
            System.out.println("\nEscolha uma opcao:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Voltar ao menu principal");
            System.out.print("Opcao: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para sacar: R$ ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Saque realizado! Novo saldo: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 2:
                    System.out.print("Digite o valor para depositar: R$ ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.printf("Deposito realizado! Novo saldo: R$ %.2f%n", saldo);
                    break;
                case 3:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Operacao invalida!");
            }
        }
    }

    // 13 - Numeros decrescentes
    public static void numerosDecrescentes() {
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        System.out.println("Numeros menores que " + numero + " em ordem decrescente:");
        for (int i = numero - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    // 14 - Valores menores que 10
    public static void valoresMenoresQueDez() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o valor " + i + ": ");
            int valor = scanner.nextInt();
            if (valor < 10) {
                System.out.println("Valor Menor que 10");
            }
        }
    }

    // 15 - Numeros pares de 1 a 50
    public static void numerosPares() {
        System.out.println("Numeros pares entre 1 e 50:");
        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
    }

    // 16 - Soma de numeros pares
    public static void somaPares() {
        int somaPares = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite o numero " + i + ": ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                somaPares += numero;
            }
        }
        System.out.println("A soma dos numeros pares e: " + somaPares);
    }
}
