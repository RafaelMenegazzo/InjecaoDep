public class ContaSimples  extends ContaBancaria{

    private double saldoPou;

    public void setSaldoPou(double saldoPou) {
        this.saldoPou = saldoPou;
    }

    public double getSaldoPou() {
        return saldoPou;
    }


    public boolean DepPou(double valor){
        if(valor < 0){
            return false;
        } else {
            setSaldoPou( getSaldoPou() + valor);
            return true;
        }
    }

    public boolean SaqPou(double valor){
        if(valor < 0 || valor > getSaldoPou()){
            return false;
        }else{
            setSaldoPou(getSaldoPou() - valor);
            return true;
        }
        
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Nome [");
        builder.append(saldoPou);
        builder.append("]\n");
        builder.append(super.toString());
        
        return builder.toString();
    }

    
}
