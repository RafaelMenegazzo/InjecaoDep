package dao;

import dto.Aluno;
import dto.Disciplina_Gerais;
import dto.Professor;
import dto.Registro_Aluno;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Disciplinas_GeraisDAO {

    final String NOMETABELA = "Disciplinas_Gerais";
    
    public boolean excluir(Disciplina_Gerais disciplinaGerais) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM Disciplinas_Gerais WHERE id_disciplina = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, disciplinaGerais.getId_disciplina());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean inserir(Disciplina_Gerais disciplinaGerais) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMETABELA + "(id_aluno, id_professor, id_disciplina, id_registro_aluno) VALUES(?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            
            for (Aluno aluno : disciplinaGerais.getAlunos()) {
                for (Professor professor : disciplinaGerais.getProfessores()) {
                    ps.setInt(1, aluno.getId_aluno());
                    ps.setInt(2, professor.getId_professor());
                    ps.setInt(3, disciplinaGerais.getId_disciplina());
                    ps.setInt(4, disciplinaGerais.getRegistro().getId_registro());

                    ps.executeUpdate();
                }
            }

            ps.close();
            conn.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean existe(Disciplina_Gerais disciplinaGerais) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMETABELA + " WHERE id_disciplina = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, disciplinaGerais.getId_disciplina());

            ResultSet rs = ps.executeQuery();
            boolean exists = rs.next();

            ps.close();
            rs.close();
            conn.close();

            return exists;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean remover(Disciplina_Gerais disciplinaGerais) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMETABELA + " WHERE id_disciplina = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, disciplinaGerais.getId_disciplina());

            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Disciplina_Gerais procurarPorId(int idDisciplina) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMETABELA + " WHERE id_disciplina = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idDisciplina);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Disciplina_Gerais disciplinaGerais = new Disciplina_Gerais();
                disciplinaGerais.setId_disciplina(rs.getInt("id_disciplina"));

                List<Aluno> alunos = new ArrayList<>();
                Aluno aluno = new Aluno();
                aluno.setId_aluno(rs.getInt("id_aluno"));
                alunos.add(aluno);
                disciplinaGerais.setAlunos(alunos);

                List<Professor> professores = new ArrayList<>();
                Professor professor = new Professor();
                professor.setId_professor(rs.getInt("id_professor"));
                professores.add(professor);
                disciplinaGerais.setProfessores(professores);

                Registro_Aluno registroAluno = new Registro_Aluno();
                registroAluno.setId_registro(idDisciplina);
                disciplinaGerais.setRegistro(registroAluno);

                ps.close();
                rs.close();
                conn.close();

                return disciplinaGerais;
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

    public List<Disciplina_Gerais> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMETABELA;
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            List<Disciplina_Gerais> lista = new ArrayList<>();
            while (rs.next()) {
                Disciplina_Gerais disciplinaGerais = new Disciplina_Gerais();
                disciplinaGerais.setId_disciplina(rs.getInt("id_disciplina"));

                List<Aluno> alunos = new ArrayList<>();
                Aluno aluno = new Aluno();
                aluno.setId_aluno(rs.getInt("id_aluno"));
                alunos.add(aluno);
                disciplinaGerais.setAlunos(alunos);

                List<Professor> professores = new ArrayList<>();
                Professor professor = new Professor();
                professor.setId_professor(rs.getInt("id_professor"));
                professores.add(professor);
                disciplinaGerais.setProfessores(professores);

                Registro_Aluno registroAluno = new Registro_Aluno();
                registroAluno.setId_registro(rs.getInt("id_registro_aluno"));
                disciplinaGerais.setRegistro(registroAluno);

                lista.add(disciplinaGerais);
            }

            ps.close();
            rs.close();
            conn.close();
            return lista;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
