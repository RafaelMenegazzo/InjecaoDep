package bo;

import dao.Registro_AlunoDAO;
import dto.Registro_Aluno;

public class RegistroAlunoBO {
	
	 public boolean inserir(Registro_Aluno registro) {
	        if (!existe(registro)) {
	            Registro_AlunoDAO registroAlunoDAO = new Registro_AlunoDAO();
	            return registroAlunoDAO.inserir(registro);
	        }
	        return false;
	    }

	    public boolean existe(Registro_Aluno registro) {
	        Registro_AlunoDAO registroAlunoDAO = new Registro_AlunoDAO();
	        return registroAlunoDAO.existe(registro.getId_registro());
	    }

}
