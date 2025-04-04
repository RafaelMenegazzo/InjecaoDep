package bo;

import java.util.List;

import dao.FaseDAO;
import dto.Fase;

public class FaseBO {
	
	 public boolean inserir(Fase fase) {
	        if (!existe(fase)) {
	            FaseDAO faseDAO = new FaseDAO();
	            return faseDAO.inserir(fase);
	        }
	        return false;
	    }

	    public boolean existe(Fase fase) {
	        FaseDAO faseDAO = new FaseDAO();
	        return faseDAO.existe(fase);
	    }
	    
	    public boolean alterar(Fase fase) {
	    	FaseDAO faseDAO = new FaseDAO();
	    	return faseDAO.alterar(fase);
	    }
	    
	    public List<Fase> PesquisarTodos(){
	    	FaseDAO faseDAO = new FaseDAO();
	    	return faseDAO.pesquisarTodas();
	    	
	    }
	    
	    public boolean excluir(Fase fase) {
	    	FaseDAO faseDAO = new FaseDAO();
	    	return faseDAO.excluir(fase);
	    }

}
