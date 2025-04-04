package bo;

import dao.ProfessorDAO;
import dto.Professor;

public class Professor_BO {
	
	public boolean inserir(Professor professor) {
		if(existe(professor) != true) {
			ProfessorDAO professorDAO = new ProfessorDAO();
			return professorDAO.inserir(professor);
		}
		
		return false;
	}
	
	public boolean existe(Professor professor) {
		ProfessorDAO professorDAO = new ProfessorDAO();
		return professorDAO.existe(professor);
		
	}

}
