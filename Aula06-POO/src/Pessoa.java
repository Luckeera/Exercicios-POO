public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, int idade, char sexo, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void fazerAniversario() {
        this.idade++;
        System.out.println("Feliz aniversário, " + this.nome + "!, voce agora tem " + this.idade + " anos.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
