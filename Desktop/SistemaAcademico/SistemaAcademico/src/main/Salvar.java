package main;

public class Salvar {
	
protected Interface salvar;
	
	public Salvar(Interface salvar) {
		this.salvar = salvar;
	}
	
	public void update() {
		salvar.enviar();
	}

}
