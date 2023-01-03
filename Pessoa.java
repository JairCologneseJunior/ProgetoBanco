public class Pessoa {
    public Pessoa(String nome, double numConta, double saldo, String tConta) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
        this.tConta = tConta;
    }
    public Pessoa() {

    }
    private String nome;
    private double numConta;
    private double saldo;
    private String tConta;

    public String gettConta() {
        return tConta;
    }

    public void settConta(String tConta) {
        this.tConta = tConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(float numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
