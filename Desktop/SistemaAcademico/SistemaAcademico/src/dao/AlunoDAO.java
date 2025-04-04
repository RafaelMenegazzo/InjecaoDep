package dao;

import dto.Aluno;
import dto.Curso;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
	

	

	    final String NOMETABELA = "Aluno";

	    
	    public boolean excluir(Aluno aluno) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM Aluno WHERE id_aluno = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, aluno.getId_aluno());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    
	    public boolean inserir(Aluno aluno) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "INSERT INTO " + NOMETABELA + "(nome, codigo, id_curso) VALUES(?, ?, ?)";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, aluno.getNome());
	            ps.setString(2, aluno.getCod());
	            ps.setInt(3, aluno.getCurso().getId_curso());

	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;

	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	    public boolean existe(Aluno aluno) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMETABELA + " WHERE nome = ? AND codigo = ?";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, aluno.getNome());
	            ps.setString(2, aluno.getCod());

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

	    public boolean alterar(Aluno aluno) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "UPDATE " + NOMETABELA + " SET nome=?, codigo=?, id_curso=? WHERE id_aluno=?";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, aluno.getNome());
	            ps.setString(2, aluno.getCod());
	            ps.setInt(3, aluno.getCurso().getId_curso());
	            ps.setInt(4, aluno.getId_aluno());

	            ps.executeUpdate();
	            conn.close();
	            return true;

	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	    public Aluno procurarPorCodigo(Aluno aluno) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMETABELA + " WHERE codigo = ?";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, aluno.getCod());

	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                Aluno alunoEncontrado = new Aluno();
	                alunoEncontrado.setId_aluno(rs.getInt("id_aluno"));
	                alunoEncontrado.setNome(rs.getString("nome"));
	                alunoEncontrado.setCod(rs.getString("codigo"));
	                
	                ps.close();
	                rs.close();
	                conn.close();
	                return alunoEncontrado;
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

	    public List<Aluno> montarLista(ResultSet rs) {
	        List<Aluno> lista = new ArrayList<>();

	        try {
	            while (rs.next()) {
	                Aluno aluno = new Aluno();
	                aluno.setId_aluno(rs.getInt("id_aluno"));
	                aluno.setNome(rs.getString("nome"));
	                aluno.setCod(rs.getString("codigo"));
	                
	                lista.add(aluno);
	            }

	            return lista;

	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

	    public List<Aluno> pesquisarTodos() {
	        List<Aluno> lista = new ArrayList<>();
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT a.id_aluno, a.nome, a.codigo, c.id_curso, c.nome_curso " +
	                         "FROM Aluno a " +
	                         "LEFT JOIN Curso c ON a.id_curso = c.id_curso"; // Junta com Curso
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	                Aluno aluno = new Aluno();
	                aluno.setId_aluno(rs.getInt("id_aluno"));
	                aluno.setNome(rs.getString("nome"));
	                aluno.setCod(rs.getString("codigo"));

	                Curso curso = new Curso();
	                curso.setId_curso(rs.getInt("id_curso"));
	                curso.setNome_curso(rs.getString("nome_curso"));

	                aluno.setCurso(curso);
	                lista.add(aluno);
	            }

	            ps.close();
	            rs.close();
	            conn.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return lista;
	    }

	}
