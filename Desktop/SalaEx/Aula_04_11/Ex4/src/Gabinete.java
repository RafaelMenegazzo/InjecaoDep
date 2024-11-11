public class Gabinete {

    private int baias;
    private String tipo;
    private String modelo;
    protected PlacaMae placa_m;


    public Gabinete(){
        placa_m = new PlacaMae();
    }

    public void setBaias(int baias) {
        this.baias = baias;
    }
    public int getBaias() {
        return baias;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setPlaca_m(PlacaMae placa_m) {
        this.placa_m = placa_m;
    }

    public PlacaMae getPlaca_m() {
        return placa_m;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        
        builder.append("Modelo = [");
        builder.append(modelo);
        builder.append("]\n");
        builder.append("Tipo = [");
        builder.append(tipo);
        builder.append("]\n");
        builder.append("Baias = [");
        builder.append(baias);
        builder.append("]\n");
        builder.append("Placa Mama = [");
        builder.append(placa_m);
        builder.append("]\n");

        return builder.toString();
    }
    
}
