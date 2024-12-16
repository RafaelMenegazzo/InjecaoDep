package DTO;
public class Usuario {
	
	
	private String login;
	private String senha;
	private int tipo_usuario;
	private int id_usuario;
	
	
	
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [login=");
		builder.append(login);
		builder.append(", senha=");
		builder.append(senha);
		builder.append(", tipo_usuario=");
		builder.append(tipo_usuario);
		builder.append(", id_usuario=");
		builder.append(id_usuario);
		builder.append("]\n");
		return builder.toString();
	}
	
	
	
	
	
    
}
