public class ContaEspecial  extends ContaBancaria{

    private int diasSemJuros;
    private double limite;
    protected CartaoCredito cc;

    public ContaEspecial(){
        cc = new CartaoCredito();
    }

    public void setCc(CartaoCredito cc) {
        this.cc = cc;
    }

    public CartaoCredito getCc() {
        return cc;
    }
    
    public void setDiasSemJuros(int diasSemJuros) {
        this.diasSemJuros = diasSemJuros;
    }

    public int getDiasSemJuros() {
        return diasSemJuros;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }


    @Override

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Dias sem juros [");
        builder.append(diasSemJuros);
        builder.append("]\n");
        builder.append("Limite [");
        builder.append(limite);
        builder.append("]\n");
        builder.append("Cartão crédito [");
        builder.append(cc.toString());
        builder.append("]\n");
        builder.append(super.toString());
        
        return builder.toString();
    }
    

    
}
