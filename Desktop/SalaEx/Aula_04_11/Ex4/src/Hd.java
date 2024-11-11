public class Hd {


    private int rpm;
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

    public void setRpm(int rpm) {
        this.rpm = rpm;
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
        builder.append("Rpm = [");
        builder.append(rpm);
        builder.append("]\n");
        builder.append("Capacidade = [");
        builder.append(capacidade);
        builder.append("]\n");


        return builder.toString();
    }
    
}
