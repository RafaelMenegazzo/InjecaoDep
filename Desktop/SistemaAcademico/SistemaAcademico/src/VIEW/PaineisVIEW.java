package VIEW;

public class PaineisVIEW {
	
public void PainelJSON() {
		
		System.out.println("------------------------------------+");
		System.out.println("            Painel JSON             |");
		System.out.println("------------------------------------|");
		System.out.println("1 - Cadastrar Novo Aluno            |");
		System.out.println("2 - Lista todos Alunos (JSON)       |");
		System.out.println("3 - Excluir Aluno                   |");
		System.out.println("4 - Sair                            |");
		System.out.println("------------------------------------+");
	}


public void PainelXML() {
	
	System.out.println("------------------------------------+");
	System.out.println("            Painel XML              |");
	System.out.println("------------------------------------|");
	System.out.println("1 - Cadastrar Novo Alunos           |");
	System.out.println("2 - Lista Todos Alunos (XML)        |");
	System.out.println("3 - Excluir Alunos                  |");
	System.out.println("4 - Sair                            |");
	System.out.println("------------------------------------+");
}

public void InvalidaOpc() {
	
	System.out.println("------------------------------------+");
	System.out.println("          Opcao Invalida            |");
	System.out.println("------------------------------------|");
}


public void limparTela() {
	
	for (int x=0; x<50 ;x++) {
		System.out.println("");
	}	
}

}
