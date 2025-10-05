public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Caderno caderno = new Caderno("Caderno de Matemática", "Azul", 100);
        Caneta caneta = new Caneta("Preto", "Bic", 2.50);

        livro.ler();
        caderno.abrir();
        caneta.escrever();

        System.out.println(livro.titulo + " foi comprado." + " " + caderno.titulo + " foi comprado." + " " + caneta.marca + " foi comprada.");


    }
}
