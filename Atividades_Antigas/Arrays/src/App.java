import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Hello, World!");
        String[] nomes = new String[5];
        
        //1. Acrescente seu nome na posição 3 do vetor e exiba-o em tela
        nomes[4] = "Lucas";
        System.out.println(nomes[4]);
        //2. Crie um programa que armazene as notas de 10 alunos
        //      recebidas pelo usuário. O programa deve retornar a maior nota
        //      em tela.
        double[] alunos = new double[10];
        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            alunos[i] = ler.nextDouble();
        }
        //3. Crie um programa com um vetor de 10 elementos inteiros. Exibir
        //      em tela os valores pares
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o numero " + i + ":");
            numeros[i] = ler.nextInt();
        }
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println("Número par: " + numero);
            }
        }

        //4. Criar um vetor com 10 idades e exibir em tela as idades maiores
        //      que 18 anos
        int[] idades = new int[10];
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade " + (i + 1) + ": ");
            idades[i] = ler.nextInt();
        }
        for (int idade : idades) {
            if (idade > 18) {
                System.out.println("Idade maior que 18: " + idade);
            }
        }

        //5. Criar um vetor com 4 notas e exibir em tela a média aritmética
        //      das notas
        double[] notas = new double[4];
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = ler.nextDouble();
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.println("Média aritmética das notas: " + media);

    }
}
