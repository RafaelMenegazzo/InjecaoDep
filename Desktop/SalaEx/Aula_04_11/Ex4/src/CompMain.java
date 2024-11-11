public class CompMain {

    public static void main(String[] args) {
        
        Computador comp = new Computador();
        Monitor monitor = new Monitor();
        Mouse mouse = new Mouse();
        Teclado teclado = new Teclado();
        Gabinete gabinete = new Gabinete();
        PlacaMae placa_m = new PlacaMae();
        Hd hd = new Hd();
        Processador processador = new Processador();
        Memoria memoria = new Memoria();

        monitor.setMarca("DELL");
        monitor.setTipo("HDMI");

        mouse.setMarca("DELL");
        mouse.setTipo("Sem fio");

        teclado.setMarca("DELL");
        teclado.setTipo("Sem fio");

        
        
        hd.setMarca("Sandisk");
        hd.setTipo("SSD");
        hd.setRpm(120);
        hd.setCapacidade(1000);
        
        memoria.setCapacidade(500);
        memoria.setVelocidade(1000);
        memoria.setMarca("AMD");
        memoria.setTipo("RAM");

        processador.setCache(2000);
        processador.setClock(60);
        processador.setMarca("Intel");
        processador.setTipo("i5");
        
        placa_m.setMarca("Intel");
        placa_m.setModelo("4044");
        placa_m.setHd(hd);
        placa_m.setMemoria(memoria);
        placa_m.setProcessador(processador);
        
        
        gabinete.setBaias(4);
        gabinete.setModelo("Notebook");
        gabinete.setTipo("Bom");
        gabinete.setPlaca_m(placa_m);


        comp.setConsumo(100);
        comp.setTensao(20);
        comp.setGabinete(gabinete);
        comp.setMouse(mouse);
        comp.setTeclado(teclado);
        comp.setMonitor(monitor);
        comp.setMarca("Inox");
        comp.setModelo("Liso");

        System.out.println(comp);
    }
    
}
