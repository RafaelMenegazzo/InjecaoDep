public class Motor {

    private String marca;
    private String combustivel;
    private float potencia;
    private int cilindros;


    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getPotencia() {
        return potencia;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Marca = [");
        builder.append(marca);
        builder.append("]\n");
        builder.append("Combustível = [");
        builder.append(combustivel);
        builder.append("]\n");
        builder.append("Cilindros = [");
        builder.append(cilindros);
        builder.append("]\n");
        builder.append("Potência = [");
        builder.append(potencia);
        builder.append("]\n");


        return builder.toString();
    }
    
    
}
