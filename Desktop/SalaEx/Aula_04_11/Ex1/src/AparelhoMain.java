public class AparelhoMain {

    public static void main(String[] args) {
        
        Aparelho ee = new Aparelho();
        SistemaDeSom ss = new SistemaDeSom();
        SistemaVideo sv = new SistemaVideo();
        HomeTheater ht = new HomeTheater();

        ee.setConsumo(10);
        ee.setTensao(10);

        ss.setConsumo(100);
        ss.setMarca("Bombril");
        ss.setModelo("Amarelo");
        ss.setPotencia(200);
        ss.setTensao(90);


        
        sv.setConsumo(100);
        sv.setMarca("Sam");
        sv.setModelo("TV");
        sv.setTipo("Oled");
        sv.setTensao(90);
        sv.setResolucao("8k");


        ht.setSom(ss);

        ht.setVideo(sv);

        System.out.println(ss);
        System.out.println(sv);
        System.out.println(ee);
        System.out.println(ht);


    }
    
}
