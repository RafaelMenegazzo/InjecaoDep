package BO;

import DAO.CanilDAO;
import DTO.Canil;
import java.util.List;

public class CanilBo {
	
	public boolean inserir(Canil canil) {
	    if (!existir(canil)) {
	        CanilDAO canilDAO = new CanilDAO();
	        return canilDAO.inserir(canil);
	    }
	    return false;
	}

	public boolean excluir(int id_canil) {
	    CanilDAO canilDAO = new CanilDAO();
	    return canilDAO.excluir(id_canil);
	}

	public boolean alterar(Canil canil) {
	    CanilDAO canilDAO = new CanilDAO();
	    return canilDAO.alterar(canil);
	}

	public List<Canil> pesquisarTodos() {
	    CanilDAO canilDAO = new CanilDAO();
	    return canilDAO.pesquisarTodos();
	}
	
	public boolean existir(Canil canil) {
		CanilDAO canilDAO = new CanilDAO();
		return canilDAO.existe(canil);
	}

	


}
