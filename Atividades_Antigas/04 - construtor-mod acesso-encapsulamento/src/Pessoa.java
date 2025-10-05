public class Pessoa {
    private String nome;
    private int idade;
    public Endereco endereco;


    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    public void getDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Endereco: " + this.endereco);
    }
}
