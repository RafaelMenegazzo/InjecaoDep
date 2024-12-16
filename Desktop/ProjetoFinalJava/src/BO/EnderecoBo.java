package BO;

import DTO.Endereco;
import DAO.EnderecoDAO;
import java.util.List;

public class EnderecoBo {
	
	public boolean inserir(Endereco endereco) {
		if(existe(endereco) != true) {
			EnderecoDAO  enderecoDAO = new EnderecoDAO();
			return enderecoDAO.inserir(endereco);
		}
		
		return false;
	}
	
	public boolean alterar(Endereco endereco) {
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		return enderecoDAO.alterar(endereco);
	}
	
	public boolean excluir(int cod) {
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		return enderecoDAO.excluir(cod);
	}
	
	public boolean existe(Endereco endereco) {
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		return enderecoDAO.existe(endereco);
	}
	
	public List<Endereco> pesquisarTodos(){
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		return enderecoDAO.pesquisarTodos();
	}
}
