public class SistemaVideo extends Aparelho {
    private String marca = "Lg";
    private String modelo = "24";
    private String tipo = "TV";
    private String resolucao = "4k";


    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }


    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("Marca= [");
        builder.append(marca);
        builder.append("]");

        builder.append("modelo = [");
        builder.append(modelo);
        builder.append("]");

        builder.append("tipo = [");
        builder.append(tipo);
        builder.append("]");
        builder.append("resoluçao = [");
        builder.append(resolucao);
        builder.append("]");
        
        builder.append(super.toString());
        builder.append("]");

        return builder.toString();

    }


    
}
