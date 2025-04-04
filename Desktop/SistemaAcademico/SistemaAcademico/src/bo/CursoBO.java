package bo;

import dao.CursoDAO;
import dto.Curso;

public class CursoBO {
	
	public boolean inserir(Curso curso) {
        if (!existe(curso)) {
            CursoDAO cursoDAO = new CursoDAO();
            return cursoDAO.inserir(curso);
        }
        return false;
    }

    public boolean existe(Curso curso) {
        CursoDAO cursoDAO = new CursoDAO();
        return cursoDAO.existe(curso);
    }

}
