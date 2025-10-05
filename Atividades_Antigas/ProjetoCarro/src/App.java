public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2021);

        carro1.getDetalhes();
        carro1.ligar();

        carro2.getDetalhes();
        carro2.ligar();
    }
}
