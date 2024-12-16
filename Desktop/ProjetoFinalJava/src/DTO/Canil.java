package DTO;

public class Canil {
	
	
	private String nome_fantasia;
	private String cnpj;
	protected Endereco endereco;
	private String cachorro;
	private String proprietario;
	private int id_canil;
	
	
	public String getNome_fantasia() {
		return nome_fantasia;
	}


	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public String getCachorro() {
		return cachorro;
	}


	public void setCachorro(String cachorro) {
		this.cachorro = cachorro;
	}


	public String getProprietario() {
		return proprietario;
	}


	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}


	public int getId_canil() {
		return id_canil;
	}


	public void setId_canil(int id_canil) {
		this.id_canil = id_canil;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Canil [nome_fantasia=");
		builder.append(nome_fantasia);
		builder.append(", cnpj=");
		builder.append(cnpj);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append(", cachorro=");
		builder.append(cachorro);
		builder.append(", proprietario=");
		builder.append(proprietario);
		builder.append(", id_canil=");
		builder.append(id_canil);
		builder.append("]\n");
		return builder.toString();
	}
	
	
	
	
	

	
	
	
    
}
