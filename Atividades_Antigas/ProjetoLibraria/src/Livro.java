public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;


    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    void ler() {
        System.out.println("Lendo o livro: " + titulo + " de " + autor);
    }
    void comprar() {
        System.out.println("Livro comprado: " + titulo + " de " + autor + ", publicado em " + anoPublicacao);
    }
    
}
