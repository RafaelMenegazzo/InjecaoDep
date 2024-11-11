public class DocumentoMain {
    
    public static void main(String[] args) {
        Documento doc = new Documento();

        doc.setTexto("Avarakedavra");

        Impressora imp = new Impressora();

        imp.imprimir(doc);


        System.out.println(doc);
    }
}
