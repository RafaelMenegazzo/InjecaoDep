public class Documento{

    private String  texto = "POO1";


    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Texto = [");
        builder.append(texto);
        builder.append("]");

        return builder.toString();
    }


    
}