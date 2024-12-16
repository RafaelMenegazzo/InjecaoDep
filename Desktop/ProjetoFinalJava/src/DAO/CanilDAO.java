package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Conexao.Conexao;
import DTO.Canil;
import DTO.Endereco;


public class CanilDAO {
	
	final String NOMETABELA = "canil";
	
	public boolean inserir(Canil canil) {
	    String sql = "INSERT INTO " + NOMETABELA + " (nome_fantasia, cnpj, proprietario, nome_dog, endereco) VALUES (?, ?, ?, ?, ?);";
	    try (Connection conn = Conexao.conectar();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setString(1, canil.getNome_fantasia());
	        ps.setString(2, canil.getCnpj());
	        ps.setString(3, canil.getProprietario());
	        ps.setString(4, canil.getCachorro());
	        ps.setObject(5, canil.getEndereco().getCod());

	        
	        ps.executeUpdate();
	        
	        ps.close();
	        conn.close();
	        return true;

	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
public boolean existe(Canil canil) {
		
		try {
			
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMETABELA + " WHERE nome_fantasia = ? AND cnpj = ? AND proprietario = ? AND nome_dog = ? AND endereco = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, canil.getNome_fantasia());
			ps.setString(2, canil.getCnpj());
			ps.setString(3, canil.getProprietario());
			ps.setString(4, canil.getCachorro());
			ps.setObject(5, canil.getEndereco().getCod());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ps.close();
				rs.close();
				conn.close();
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return false;
	}
	public boolean alterar(Canil canil) {
	    String sql = "UPDATE " + NOMETABELA + " SET nome_fantasia = ?, cnpj = ?, proprietario = ?, nome_dog = ?, endereco = ? WHERE id_canil = ?;";
	    try (Connection conn = Conexao.conectar();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setString(1, canil.getNome_fantasia());
	        ps.setString(2, canil.getCnpj());
	        ps.setString(3, canil.getProprietario());
	        ps.setString(4, canil.getCachorro());
	        ps.setObject(5, canil.getEndereco().getCod());
	        ps.setInt(6, canil.getId_canil());

	        ps.executeUpdate();
	        return true;

	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}

	public boolean excluir(int id_canil) {
	    String sql = "DELETE FROM " + NOMETABELA + " WHERE id_canil = ?;";
	    try (Connection conn = Conexao.conectar();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setInt(1, id_canil);
	        ps.executeUpdate();
	        return true;

	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}


	private List<Canil> montarLista(ResultSet rs) {
	    List<Canil> listObj = new ArrayList<>();
	    try {
	        while (rs.next()) {
	            Canil obj = new Canil();
	            Endereco endereco = new Endereco();

	           
	            endereco.setCod(rs.getInt(6));

	            obj.setId_canil(rs.getInt(1));
	            obj.setNome_fantasia(rs.getString(2));
	            obj.setCnpj(rs.getString(3));
	            obj.setProprietario(rs.getString(4));
	            obj.setCachorro(rs.getString(5));
	            obj.setEndereco(endereco);

	            listObj.add(obj);
	        }
	        
	        return listObj;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	        
	    }
	}


	public List<Canil> pesquisarTodos() {
	    try {
	        Connection conn = Conexao.conectar();
	        String sql = "SELECT * FROM " + NOMETABELA + ";";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
	        List<Canil> listObj = montarLista(rs);
	        return listObj;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}


}
