public class ContaBMain {

    public static void main(String[] args) {
    
        ContaSimples cs = new ContaSimples();
        ContaEspecial ce = new ContaEspecial();
        Banco b = new Banco();
        Pessoa p = new Pessoa();
        CartaoCredito cc = new CartaoCredito();

        cc.setLimite(1300);
        cc.setNum(4);
        cc.setOperadora("mastercard");
        cc.setTipoCartao("Crédito");

        b.setCod(143);
        b.setNome("NuBank");
        b.setNumAge(223);

        p.setEndereco("Alameda brisa suave");
        p.setNome("Rogério");

        cs.setAgencia(1034);
        cs.setBanco(b);
        cs.setCorrentista(p);
        cs.setSaldo(1700);
        cs.setNumConta(99);
        cs.setSaldoPou(1500);
    

        ce.setBanco(b);
        ce.setCorrentista(p);
        ce.setCc(cc);
        ce.setAgencia(165);
        ce.setDiasSemJuros(15);
        ce.setLimite(8000);
        ce.setSaldo(5000);
        ce.setNumConta(5003);
        

        System.out.println(ce);
        System.out.println(cs);
        
    }
    
}
