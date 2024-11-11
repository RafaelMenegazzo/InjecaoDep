public class EquipEle {


    private float tensao;
    private float consumo;


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
        builder.append("]\n");
        builder.append("Consumo = [");
        builder.append(consumo);
        builder.append("]\n");


        return builder.toString();
    }
}