public class Computador extends EquipEle {

    private String marca;
    private String modelo;
    protected Gabinete gabinete;
    protected Teclado teclado;
    protected Mouse mouse;
    protected Monitor monitor;


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

    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }

    public Gabinete getGabinete() {
        return gabinete;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        
        builder.append("Marca = [");
        builder.append(marca);
        builder.append("]\n");
        builder.append("modelo = [");
        builder.append(modelo);
        builder.append("]\n");
        builder.append("Monitor = [");
        builder.append(monitor);
        builder.append("]\n");
        builder.append("Gabinete = [");
        builder.append(gabinete);
        builder.append("]\n");
        builder.append("Teclado = [");
        builder.append(teclado);
        builder.append("]\n");
        builder.append("Mouse = [");
        builder.append(mouse);
        builder.append("]\n");


        return builder.toString();

    }

    
}
