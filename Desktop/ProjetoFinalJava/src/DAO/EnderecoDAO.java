package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import DTO.Endereco;
import Conexao.Conexao;

public class EnderecoDAO {

	
	final String NOMETABELA = "endereco";
	
	public boolean inserir(Endereco endereco) {
	    try {
	        Connection conn = Conexao.conectar();
	        String sql = "INSERT INTO " + NOMETABELA + " (rua, bairro, cidade, uf, num) VALUES (?, ?, ?, ?, ?);";
	        PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
	        ps.setString(1, endereco.getRua());
	        ps.setString(2, endereco.getBairro());
	        ps.setString(3, endereco.getCidade());
	        ps.setString(4, endereco.getUf());
	        ps.setInt(5, endereco.getNum());
	        
	        ps.executeUpdate();

	        
	        ResultSet rs = ps.getGeneratedKeys();
	        if (rs.next()) {
	            endereco.setCod(rs.getInt(1));
	        }

	        rs.close();
	        ps.close();
	        conn.close();
	        return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}

	
	public boolean alterar(Endereco endereco) {
	    try {
	        Connection conn = Conexao.conectar();

	        String sql = "UPDATE " + NOMETABELA + " SET rua = ?, bairro = ?, cidade = ?, uf = ?, num = ? WHERE Id_rua = ?;";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setString(1, endereco.getRua());
	        ps.setString(2, endereco.getBairro());
	        ps.setString(3, endereco.getCidade());
	        ps.setString(4, endereco.getUf());
	        ps.setInt(5, endereco.getNum());
	        ps.setInt(6, endereco.getCod());
	        ps.executeUpdate();
	        ps.close();
	        conn.close();
	        return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	public boolean excluir(int cod) {
		
		try {
			Connection conn = Conexao.conectar();
			String sql = "DELETE FROM " + NOMETABELA + " WHERE Id_rua = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cod);
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;	
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public List<Endereco> pesquisarTodos(){
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMETABELA + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Endereco> listObj = montarLista(rs);
			return listObj;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Endereco> montarLista(ResultSet rs){
		List<Endereco> listObj = new ArrayList<Endereco>();
		try {
			while(rs.next()) {
				Endereco obj = new Endereco();
				obj.setCod(rs.getInt(1));
				obj.setRua(rs.getString(2));
				obj.setBairro(rs.getString(3));
				obj.setCidade(rs.getString(4));
				obj.setUf(rs.getString(5));
				obj.setNum(rs.getInt(6));
				
				listObj.add(obj);
				
			}
			return listObj;
			
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean existe(Endereco endereco) {
		try {
			Connection conn = Conexao.conectar();
			String sql =  "SELECT * FROM " + NOMETABELA + " WHERE rua = ? AND bairro = ? AND cidade = ? AND uf = ? AND num = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			 ps.setString(1, endereco.getRua());
	         ps.setString(2, endereco.getBairro());
	         ps.setString(3, endereco.getCidade());
	         ps.setString(4, endereco.getUf());
	         ps.setInt(5, endereco.getNum());
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
	
	
	
	
	
	
}
