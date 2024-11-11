public class ContaBancaria {

    protected Banco banco; 
    protected Pessoa correntista;
    private int agencia;
    private int numConta;
    private double saldo;

    public ContaBancaria(){
        banco = new Banco();
        correntista = new Pessoa();
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public int getAgencia() {
        return agencia;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

    public Pessoa getCorrentista() {
        return correntista;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }


    public boolean deposito(double valor){
        if(valor < 0){
            return false;
        } else{
            setSaldo(getSaldo() + valor);
            return true;

        }
    }

    public boolean saque(double valor){
        if(valor < 0 || valor > getSaldo()){
            return false;
        } else{
            setSaldo( getSaldo() - valor);
            return true;
        }
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Saldo [");
        builder.append(saldo);
        builder.append("]\n");
        builder.append("Agência [");
        builder.append(agencia);
        builder.append("]\n");
        builder.append("Número da conta [");
        builder.append(numConta);
        builder.append("]\n");
        builder.append("Concorrista [");
        builder.append(correntista.toString());
        builder.append("]\n");
        builder.append("Banco [");
        builder.append(banco);
        builder.append("]\n");
        
        return builder.toString();

    }


    
}
