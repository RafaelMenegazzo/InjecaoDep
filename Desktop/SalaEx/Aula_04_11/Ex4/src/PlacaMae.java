public class PlacaMae {

    private String marca;
    private String modelo;
    protected Processador processador;
    protected Hd hd;
    protected Memoria memoria;

    public PlacaMae(){
        processador = new Processador();
        hd = new Hd();
        memoria = new Memoria();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setHd(Hd hd) {
        this.hd = hd;
    }
    public Hd getHd() {
        return hd;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Processador getProcessador() {
        return processador;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Marca = [");
        builder.append(marca);
        builder.append("]\n");
        builder.append("Modelo = [");
        builder.append(modelo);
        builder.append("]\n");
        builder.append("HD = [");
        builder.append(hd);
        builder.append("]\n");
        builder.append("Processador = [");
        builder.append(processador);
        builder.append("]\n");
        builder.append("Memória = [");
        builder.append(memoria);
        builder.append("]\n");

        return builder.toString();
    }
    
}
