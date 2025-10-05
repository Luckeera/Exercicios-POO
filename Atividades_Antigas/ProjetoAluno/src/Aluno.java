public class Aluno {
    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;
    double av3;

    public Aluno(String nome, int matricula, double notaAv1, double notaAv2, double av3) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
        this.av3 = av3;
    }

    public double calcularMedia() {
        return (notaAv1 + notaAv2) / 2;
    }

    public void getDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota AV1: " + notaAv1);
        System.out.println("Nota AV2: " + notaAv2);
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        double mediaFinal = (media + av3) / 2;
        if (media >= 7) {
            System.out.println("Aluno aprovado com média: " + media);
        } 
        else if (media >= 4 && media < 7) {
            System.out.println("Aluno vai para recuperacao final com essa média: " + media);
            if(mediaFinal >= 5) {
                System.out.println("Aluno aprovado na recuperacao final com média: " + mediaFinal);
            }
            else {
                System.out.println("Aluno reprovado na recuperacao final com média: " + mediaFinal);
            }
        } 
        else {
            System.out.println("Aluno reprovado com média: " + media);
        }
    }
}
