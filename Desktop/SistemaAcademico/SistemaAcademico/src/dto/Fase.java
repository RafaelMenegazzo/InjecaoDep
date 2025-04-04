package dto;

import java.util.ArrayList;

public class Fase {
	
	private int id_fase;
	private int fase;
	private ArrayList<Disciplina> disciplinas;
	protected Curso curso;
	
	
	public int getId_fase() {
		return id_fase;
	}
	public void setId_fase(int id_fase) {
		this.id_fase = id_fase;
	}
	public int getFase() {
		return fase;
	}
	public void setFase(int fase) {
		this.fase = fase;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	

}
