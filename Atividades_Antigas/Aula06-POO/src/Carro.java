public class Carro extends Veiculo {
    private int numeroPortas;
    
    public Carro(String marca, String modelo, int numeroPortas) {
        super(marca, modelo);
        this.numeroPortas = numeroPortas;
    }
}
