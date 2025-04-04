package dao;

import dto.Disciplina;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DisciplinaDAO {
	
	private final String NOMETABELA = "Disciplina";
	
	
	public boolean excluir(Disciplina disciplina) {
	    try {
	        Connection conn = Conexao.conectar();
	        String sql = "DELETE FROM Disciplina WHERE id_disciplina = ?;";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setInt(1, disciplina.getId_disciplina());
	        ps.executeUpdate();
	        ps.close();
	        conn.close();
	        return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	public boolean inserir(Disciplina disciplina) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMETABELA + "(carga_horaria, nome_disciplina, cod_disciplina) VALUES(?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, disciplina.getCarga_horaria());
            ps.setString(2, disciplina.getNome_disciplina());
            ps.setString(3, disciplina.getCod_disciplina());

            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean existe(Disciplina disciplina) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMETABELA + " WHERE nome_disciplina = ? AND cod_disciplina = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, disciplina.getNome_disciplina());
            ps.setString(2, disciplina.getCod_disciplina());

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

    public boolean alterar(Disciplina disciplina) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMETABELA + " SET carga_horaria=?, nome_disciplina=?, cod_disciplina=? WHERE id_disciplina=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, disciplina.getCarga_horaria());
            ps.setString(2, disciplina.getNome_disciplina());
            ps.setString(3, disciplina.getCod_disciplina());
            ps.setInt(4, disciplina.getId_disciplina());

            ps.executeUpdate();
            conn.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Disciplina procurarPorCodigo(String codDisciplina) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMETABELA + " WHERE cod_disciplina = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, codDisciplina);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Disciplina disciplinaEncontrada = new Disciplina();
                disciplinaEncontrada.setId_disciplina(rs.getInt("id_disciplina"));
                disciplinaEncontrada.setCarga_horaria(rs.getInt("carga_horaria"));
                disciplinaEncontrada.setNome_disciplina(rs.getString("nome_disciplina"));
                disciplinaEncontrada.setCod_disciplina(rs.getString("cod_disciplina"));

                ps.close();
                rs.close();
                conn.close();
                return disciplinaEncontrada;
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

    public List<Disciplina> montarLista(ResultSet rs) {
        List<Disciplina> lista = new ArrayList<>();

        try {
            while (rs.next()) {
                Disciplina disciplina = new Disciplina();
                disciplina.setId_disciplina(rs.getInt("id_disciplina"));
                disciplina.setCarga_horaria(rs.getInt("carga_horaria"));
                disciplina.setNome_disciplina(rs.getString("nome_disciplina"));
                disciplina.setCod_disciplina(rs.getString("cod_disciplina"));

                lista.add(disciplina);
            }

            return lista;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Disciplina> pesquisarTodas() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMETABELA;
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            List<Disciplina> lista = montarLista(rs);
            return lista;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	


}
