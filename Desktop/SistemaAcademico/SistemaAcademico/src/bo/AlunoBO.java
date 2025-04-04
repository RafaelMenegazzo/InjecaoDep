package bo;

import java.util.List;

import dao.AlunoDAO;
import dto.Aluno;

public class AlunoBO {
    
    public boolean inserir(Aluno aluno) {
        if (!existe(aluno)) {
            AlunoDAO alunoDAO = new AlunoDAO();
            return alunoDAO.inserir(aluno);
        }
        return false;
    }

    public boolean existe(Aluno aluno) {
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.existe(aluno);
    }
    
    public boolean alterar(Aluno aluno) {
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.alterar(aluno);
    }
    
    public List<Aluno> pesquisarTodos() {
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.pesquisarTodos();
    }
    
    public boolean excluir(Aluno aluno) {
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.excluir(aluno);
    }
}
