public class Pj extends Pessoa{
    private int cnpj;

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public Pj(String nome, double numConta, double saldo, String tConta, int cnpj) {
        super(nome, numConta, saldo, tConta);

    }
    public Pj(String nome, double numConta, double saldo, int cnpj) {
        super(nome, numConta, saldo);

    }

    public Pj() {}
    @Override
    public double sacar(double val){
        val += val *0.005;
        return super.sacar(val);
    }
    public double transferir(double val){
        val+= val*0.005;
        return super.transferir(val);
    }

    public double investir(double val){
         val+=val * 0.02;
         return super.investir(val);
    }




}

