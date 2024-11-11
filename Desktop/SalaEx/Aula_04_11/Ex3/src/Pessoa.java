public class Pessoa {

    private String nome;
    private String endereco;

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Nome [");
        builder.append(nome);
        builder.append("]\n");
        builder.append("Endereco = [");
        builder.append(endereco);
        builder.append("']");

        return builder.toString();
    }
    
}
