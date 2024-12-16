package DTO;

public enum TipoUsuario {
	
	ADMIN(1),
	ClIENTE(2),
	PROPRIETARIO(3);
	
	private final int valor;
	
	TipoUsuario(int valorOpcao){
		valor = valorOpcao;
	}
	
	public int getValor() {
		return valor;
	}
    
}
