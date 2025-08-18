public class Caderno {
    
    String titulo;
    String cor;
    int numeroPaginas;

    public Caderno(String titulo, String cor, int numeroPaginas) {
        this.titulo = titulo;
        this.cor = cor;
        this.numeroPaginas = numeroPaginas;
    }

    void abrir() {
        System.out.println("Caderno aberto: " + titulo);
    }

    void comprar(){
        System.out.println("Caderno comprado: " + titulo + " de cor " + cor + " com " + numeroPaginas + " páginas");

    }

    
}
