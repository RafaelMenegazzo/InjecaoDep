public class Pessoa {

    private String nome;
    private String endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Nome = [");
        builder.append(nome);
        builder.append("]\n");
        builder.append("Endereço = [");
        builder.append(endereco);
        builder.append("]\n");
       


        return builder.toString();
    }
    
}
