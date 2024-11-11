public class CarroMain {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Motor m = new Motor();
        Pessoa pessoa = new Pessoa();

        m.setCilindros(2);
        m.setCombustivel("Gasolina");
        m.setMarca("Pitbull");
        m.setPotencia(1000);

        pessoa.setNome("Dj Maverick");
        pessoa.setEndereco("Gustavo Guanabara; N° 321");

        carro.setMotor(m);
        carro.setPessoa(pessoa);
        carro.setAno(2009);
        carro.setFabricante("tchevrolé");
        carro.setCor("Pretão");
        carro.setModelo("Musculoso");
        

        System.out.println(carro);
        carro.pessoa.setNome("Jorge");
        System.out.print(pessoa);

    }
    
}
