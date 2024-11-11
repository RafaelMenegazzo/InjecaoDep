public class Memoria {

    private float velocidade;
    private float capacidade;
    private String marca;
    private String tipo;
    
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getVelocidade() {
        return velocidade;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Marca = [");
        builder.append(marca);
        builder.append("]\n");
        builder.append("Tipo = [");
        builder.append(tipo);
        builder.append("]\n");
        builder.append("Velocidade = [");
        builder.append(velocidade);
        builder.append("]\n");
        builder.append("Capacidade = [");
        builder.append(capacidade);
        builder.append("]\n");


        return builder.toString();
    }
    
    
}
