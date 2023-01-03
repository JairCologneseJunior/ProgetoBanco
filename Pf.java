public class Pf extends Pessoa {
    private double cpf;

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public Pf(String nome, double numConta, double saldo,String tConta, double cpf) {
        super(nome, numConta, saldo, tConta);

    }
}

