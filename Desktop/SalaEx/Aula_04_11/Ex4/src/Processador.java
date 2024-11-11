public class Processador {

    private float clock;
    private float cache;
    private String marca;
    private String tipo;

    public void setCache(float cache) {
        this.cache = cache;
    }

    public float getCache() {
        return cache;
    }

    public void setClock(float clock) {
        this.clock = clock;
    }
    public float getClock() {
        return clock;
    }
    
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
        builder.append("Cache = [");
        builder.append(cache);
        builder.append("]\n");
        builder.append("Clock = [");
        builder.append(clock);
        builder.append("]\n");

        return builder.toString();
    }

}
