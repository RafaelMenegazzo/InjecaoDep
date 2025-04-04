package dto;

import java.util.List;

public class Disciplina_Gerais extends Disciplina {
	
	protected List<Aluno> alunos;
	protected List<Professor> professores;
	protected Registro_Aluno registro;
	
	
	
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}



	public List<Professor> getProfessores() {
		return professores;
	}



	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}



	public Registro_Aluno getRegistro() {
		return registro;
	}



	public void setRegistro(Registro_Aluno registro) {
		this.registro = registro;
	}



	public void matricularAluno(Aluno aluno) {
		
	}
	
	

}
