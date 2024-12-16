package BO;

import DAO.UsuarioDAO;
import DTO.Usuario;
import java.util.List;

public class UsuarioBo {
	
	public boolean inserir(Usuario usuario) {
		if(existe(usuario) != true) {
			UsuarioDAO  usuarioDAO = new UsuarioDAO();
			return usuarioDAO.inserir(usuario);
		}
		
		return false;
	}
	
	
	
	public boolean altera(Usuario usuario) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.alterar(usuario);
	}
	
	public boolean existe(Usuario usuario) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.existe(usuario);
	}
	
	public boolean excluir(int id_usuario) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.excluir(id_usuario);
	}
	
	public List<Usuario> pesquisarTodos(){
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.pesquisarTodos();
		}

}
