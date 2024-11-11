public class Monitor {

    private String resolucao;
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Marca = [");
        builder.append(marca);
        builder.append("]\n");
        builder.append("Tipo = [");
        builder.append(tipo);
        builder.append("]\n");
        builder.append("Resolução = [");
        builder.append(resolucao);
        builder.append("]\n");

        return builder.toString();
    }

}
