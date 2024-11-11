public class Banco {

    private int cod;
    private int numAge;
    private String nome;

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }

    public int getNumAge() {
        return numAge;
    }

    @Override

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Codígo [");
        builder.append(cod);
        builder.append("]\n");
        builder.append("nome [");
        builder.append(nome);
        builder.append("]\n");
        builder.append("Numero Agência [");
        builder.append(numAge);
        builder.append("]\n");
        
        return builder.toString();
    }
    
}
