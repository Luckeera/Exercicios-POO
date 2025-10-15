public class Professor extends Pessoa {
    private String especialidade;
    private int salario;


    public Professor(String nome, int idade, char sexo, String especialidade, int salario, String endereco, String telefone) {
        super(nome, idade, sexo, endereco, telefone);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(int aumento) {
        this.salario += aumento;
        System.out.println("Parabéns, você recebeu um aumento de R$" + aumento + ". Seu novo salário é de R$" + this.salario + ".");
    }
}
