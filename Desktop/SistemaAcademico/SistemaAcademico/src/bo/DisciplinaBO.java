package bo;

import dao.DisciplinaDAO;
import dto.Disciplina;

public class DisciplinaBO {
	
	   public boolean inserir(Disciplina disciplina) {
	        if (!existe(disciplina)) {
	            DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
	            return disciplinaDAO.inserir(disciplina);
	        }
	        return false;
	    }

	    public boolean existe(Disciplina disciplina) {
	        DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
	        return disciplinaDAO.existe(disciplina);
	    }

}
