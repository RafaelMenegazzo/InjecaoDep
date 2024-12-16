package DTO;

import java.time.LocalDate;


public class Cachorro {
	
	private String nome;
	private String Sexo;
	private String cor;
	private String tipo_pelo;
	private String raca;
	private String dono;
	private LocalDate data_nascimento;
	protected Pais pai;
	protected Pais mae;
	
	private double peso;
	private double tamanho;
	private int chip;
	private int id_dog;
	
	
	
	
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public LocalDate getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public int getId_dog() {
		return id_dog;
	}
	public void setId_dog(int id_dog) {
		this.id_dog = id_dog;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		this.Sexo = sexo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo_pelo() {
		return tipo_pelo;
	}
	public void setTipo_pelo(String tipo_pelo) {
		this.tipo_pelo = tipo_pelo;
	}
	

	public Pais getPai() {
		return pai;
	}
	public void setPai(Pais pai) {
		this.pai = pai;
	}
	public Pais getMae() {
		return mae;
	}
	public void setMae(Pais mae) {
		this.mae = mae;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public int getChip() {
		return chip;
	}
	public void setChip(int chip) {
		this.chip = chip;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cachorro [nome=");
		builder.append(nome);
		builder.append(", Sexo=");
		builder.append(Sexo);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", tipo_pelo=");
		builder.append(tipo_pelo);
		builder.append(", raca=");
		builder.append(raca);
		builder.append(", dono=");
		builder.append(dono);
		builder.append(", data_nascimento=");
		builder.append(data_nascimento);
		builder.append(", pai=");
		builder.append(pai);
		builder.append(", mae=");
		builder.append(mae);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", tamanho=");
		builder.append(tamanho);
		builder.append(", chip=");
		builder.append(chip);
		builder.append(", id_dog=");
		builder.append(id_dog);
		builder.append("]\n");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
	

}
