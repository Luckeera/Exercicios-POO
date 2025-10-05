public class Caneta {
    
    String cor;
    String marca;
    double preco;

    public Caneta(String cor, String marca, double preco) {
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
    }

    void escrever() {
        System.out.println("Escrevendo com a caneta " + marca + " de cor " + cor);
    }
    void comprar() {
        System.out.println("Caneta comprada: " + marca + " de cor " + cor + " por R$" + preco);
    }

    
    
}
