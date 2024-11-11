public class SistemaDeSom extends Aparelho{

    private  String marca = "Sony";
    private String modelo = "s2";
    private float potencia = 2;

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getPotencia() {
        return potencia;
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

        builder.append("potencia = [");
        builder.append(potencia);
        builder.append("]");
        builder.append(super.toString());
        builder.append("]");

        return builder.toString();

    }
    
}
