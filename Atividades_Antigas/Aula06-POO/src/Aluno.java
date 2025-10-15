public class Aluno extends Pessoa {
    private boolean matriculaAtiva;
    private String curso;

    public Aluno(String nome, int idade, char sexo, boolean matriculaAtiva, String curso, String endereco, String telefone) {
        super(nome, idade, sexo, endereco, telefone);
        this.matriculaAtiva = matriculaAtiva;
        this.curso = curso;
    }

    public void cancelarMatr(){
        if (this.matriculaAtiva) {
            this.matriculaAtiva = false;
            System.out.println("Matrícula cancelada com sucesso.");
        } else {
            System.out.println("Você não possui uma matrícula ativa.");
        }
    }
}
