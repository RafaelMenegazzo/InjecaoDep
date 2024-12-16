package BO;


import DAO.CachorroDAO;
import DTO.Cachorro;
import java.util.List;


public class CachorroBo {
	
	
	public boolean inserir(Cachorro dog) {
		if(existir(dog) != true) {
			CachorroDAO dogDAO = new CachorroDAO();
			return dogDAO.inserir(dog);
		}
		
		return false;
	}
	
	
	public boolean excluir(int id_dog) {
		CachorroDAO dogDAO = new CachorroDAO();
		return dogDAO.excluir(id_dog);
	}
	
	public boolean alterar(Cachorro dog) {
		CachorroDAO dogDAO = new CachorroDAO();
		return dogDAO.alterar(dog);
	}
	
	public List<Cachorro> PesquisarTodos(){
		CachorroDAO dogDAO = new CachorroDAO();
		return dogDAO.PesquisarTodos();
	}
	
	
	public boolean existir(Cachorro dog) {
		CachorroDAO dogDAO = new CachorroDAO();
		return dogDAO.existe(dog);
	}
	
}
