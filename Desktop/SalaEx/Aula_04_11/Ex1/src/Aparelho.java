public class Aparelho {

    private float consumo = 2;
    private float tensao = 1;

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setTensao(float tensao) {
        this.tensao = tensao;
    }

    public float getTensao() {
        return tensao;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Tensão = [");
        builder.append(tensao);
        builder.append("]");

        builder.append("Consumo = [");
        builder.append(consumo);
        builder.append("]");

        return builder.toString();
    }
    
}
