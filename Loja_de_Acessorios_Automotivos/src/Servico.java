// Conceito: HERANÇA - Servico herda de ItemVenda
public class Servico extends ItemVenda {
    // Conceito: ENCAPSULAMENTO - Atributos privados específicos de Servico
    private int tempoEstimado; // Em minutos
    private String mecanico;
    private static final double TAXA_MAO_DE_OBRA = 0.30; // 30% de mão de obra
    
    // Construtor
    public Servico(String nome, double precoBase, int tempoEstimado, String mecanico) {
        super(nome, precoBase); // Chama o construtor da classe pai
        this.tempoEstimado = tempoEstimado;
        this.mecanico = mecanico;
    }
    
    // Conceito: ENCAPSULAMENTO - Métodos get e set
    public int getTempoEstimado() {
        return tempoEstimado;
    }
    
    public void setTempoEstimado(int tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }
    
    public String getMecanico() {
        return mecanico;
    }
    
    public void setMecanico(String mecanico) {
        this.mecanico = mecanico;
    }
    
    // Conceito: POLIMORFISMO - Sobrescrita do método abstrato da classe pai
    // Servico calcula o preço final somando a taxa de mão de obra
    @Override
    public double calcularPrecoFinal() {
        double maoDeObra = getPrecoBase() * TAXA_MAO_DE_OBRA;
        return getPrecoBase() + maoDeObra;
    }
    
    // Conceito: POLIMORFISMO - Sobrescrita do método da interface
    @Override
    public void mostrarDados() {
        System.out.println("--- SERVICO ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Mecanico: " + mecanico);
        System.out.println("Tempo Estimado: " + tempoEstimado + " minutos");
        System.out.println("Preco Base: R$ " + getPrecoBase());
        System.out.println("Taxa de Mao de Obra: " + (TAXA_MAO_DE_OBRA * 100) + "%");
        System.out.println("Preco Final: R$ " + calcularPrecoFinal());
    }
}
