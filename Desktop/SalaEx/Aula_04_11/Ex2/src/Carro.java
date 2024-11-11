public class Carro{

    protected Motor motor;
    protected Pessoa pessoa;
    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;

    public Carro(){
        motor = new Motor();
        pessoa = new Pessoa();
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Fabricante = [");
        builder.append(fabricante);
        builder.append("]\n");
        builder.append("Modelo = [");
        builder.append(modelo);
        builder.append("]\n");
        builder.append("Cor = [");
        builder.append(cor);
        builder.append("]\n");
        builder.append("ano = [");
        builder.append(ano);
        builder.append("]\n");


        builder.append("motor = [");
        builder.append(motor.toString());
        builder.append("]\n");
        builder.append("ano = [");
        builder.append(pessoa.toString());
        builder.append("]\n");


        return builder.toString();
    }

}