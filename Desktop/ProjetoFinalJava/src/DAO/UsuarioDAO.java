package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Conexao.Conexao;
import DTO.Usuario;

public class UsuarioDAO {
	
	final String NOMETABELA = "Usuario";
	
	public boolean inserir(Usuario usuario) {
		
		try {
			
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + NOMETABELA + "(login, senha, tipo_usuario) VALUES (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, usuario.getLogin());
			ps.setString(2, usuario.getSenha());
			ps.setInt(3, usuario.getTipo_usuario());
			ps.executeUpdate();
			
	        ps.close();
	        conn.close();
	        return true;
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public boolean alterar(Usuario usuario) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + NOMETABELA + " SET login = ?, senha = ?, tipo_usuario = ? WHERE id_usuario = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, usuario.getLogin());
			ps.setString(2, usuario.getSenha());
			ps.setInt(3, usuario.getTipo_usuario());
			ps.setInt(4, usuario.getId_usuario());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
			
			
		} catch(Exception e){
			e.printStackTrace();
			return false;
			
		}
	}
	
	public boolean existe(Usuario usuario) {
		try {
			Connection conn = Conexao.conectar();
			String sql =  "SELECT * FROM " + NOMETABELA + " WHERE login = ? AND senha = ? AND tipo_usuario = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			 ps.setString(1, usuario.getLogin());
	         ps.setString(2, usuario.getSenha());
	         ps.setInt(3, usuario.getTipo_usuario());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ps.close();
				rs.close();
				conn.close();
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return false;
	}
	
	
	public boolean excluir(int id_usuario) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "DELETE FROM " + NOMETABELA + " WHERE id_usuario = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id_usuario);
			ps.executeUpdate();
			ps.close();
			conn.close();
			
			return true;
			
			
			
		}  catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public List<Usuario> pesquisarTodos(){
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMETABELA + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Usuario> listObj = montarLista(rs);
			return listObj;
			
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public List<Usuario> montarLista(ResultSet rs){
		List<Usuario> listObj = new ArrayList<Usuario>();
		try {
			while(rs.next()) {
				Usuario obj = new Usuario();
				obj.setId_usuario(rs.getInt(1));
				obj.setLogin(rs.getString(2));
				obj.setSenha(rs.getString(3));
				obj.setTipo_usuario(rs.getInt(4));
				listObj.add(obj);
			}
			
			return listObj;
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
