package dao;

import dto.Fase;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FaseDAO {
	
	private final String NOMETABELA = "Fase";
	
	public boolean excluir(Fase fase) {
	    try {
	        Connection conn = Conexao.conectar();
	        String sql = "DELETE FROM Fase WHERE id_fase = ?;";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setInt(1, fase.getId_fase());
	        ps.executeUpdate();
	        ps.close();
	        conn.close();
	        return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	 public boolean inserir(Fase fase) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "INSERT INTO " + NOMETABELA + "(fase) VALUES(?)";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, fase.getFase());

	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;

	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	    public boolean existe(Fase fase) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMETABELA + " WHERE fase = ?";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, fase.getFase());

	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
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

	    public boolean alterar(Fase fase) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "UPDATE " + NOMETABELA + " SET fase=? WHERE id_fase=?";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, fase.getFase());
	            ps.setInt(2, fase.getId_fase());

	            ps.executeUpdate();
	            conn.close();
	            return true;

	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	    public Fase procurarPorId(int idFase) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMETABELA + " WHERE id_fase = ?";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, idFase);

	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                Fase faseEncontrada = new Fase();
	                faseEncontrada.setId_fase(rs.getInt("id_fase"));
	                faseEncontrada.setFase(rs.getInt("fase"));

	                ps.close();
	                rs.close();
	                conn.close();
	                return faseEncontrada;
	            } else {
	                ps.close();
	                rs.close();
	                conn.close();
	                return null;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

	    public List<Fase> montarLista(ResultSet rs) {
	        List<Fase> lista = new ArrayList<>();

	        try {
	            while (rs.next()) {
	                Fase fase = new Fase();
	                fase.setId_fase(rs.getInt("id_fase"));
	                fase.setFase(rs.getInt("fase"));

	                lista.add(fase);
	            }
	            return lista;

	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

	    public List<Fase> pesquisarTodas() {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMETABELA;
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();

	            List<Fase> lista = montarLista(rs);
	            return lista;

	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	
	

}
