public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("João", 12345, 6.5, 7.0, 8.0);
        Aluno aluno2 = new Aluno("Maria", 67890, 5.0, 6.0, 4.0);


        aluno1.notaAv1 = 9.0; // Atualizando nota AV1 do aluno1

        aluno1.getDados();
        aluno1.verificarAprovacao();

        
    }
}
