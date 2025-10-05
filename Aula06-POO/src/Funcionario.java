public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    private int valorCredito;
    private int valorDivida;

    public Funcionario(String nome, int idade, char sexo, String setor, boolean trabalhando, String endereco, String telefone) {
        super(nome, idade, sexo, endereco, telefone);
        this.setor = setor;
        this.trabalhando = trabalhando;
        this.valorCredito = 0;
        this.valorDivida = 0;
    }
    
    public void getSaldo(){
        System.out.println("O saldo do funcionario e de R$" + (this.valorCredito - this.valorDivida) + ".");
    }

    public void mudarTrabalho(boolean trabalhando) {
        this.trabalhando = trabalhando;
        System.out.println("Trabalhando mudado para " + this.trabalhando + ".");
    }


    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public int getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(int valorCredito) {
        this.valorCredito = valorCredito;
    }

    public int getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(int valorDivida) {
        this.valorDivida = valorDivida;
    }

    
}
