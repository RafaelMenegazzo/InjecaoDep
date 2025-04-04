package XML;

import dto.Aluno;
import dto.Curso;


import java.util.Scanner;

public class EscolhaXML {

    public void Escolha() {
        Scanner scanner = new Scanner(System.in);
        AlunoXMLDAO alunoDAO = new AlunoXMLDAO();

        System.out.println("Escolha uma ação:");
        System.out.println("1 - Adicionar Aluno");
        System.out.println("2 - Listar Alunos");
        System.out.println("3 - Alterar Aluno");
        System.out.println("4 - Excluir Aluno");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                Aluno aluno = new Aluno();
                Curso curso = new Curso();

                System.out.println("Nome do aluno:");
                aluno.setNome(scanner.nextLine());

                System.out.println("Código do aluno:");
                aluno.setCod(scanner.nextLine());

                System.out.println("Nome do curso:");
                curso.setNome_curso(scanner.nextLine());

                aluno.setCurso(curso);

                if (alunoDAO.inserir(aluno)) {
                    System.out.println("Aluno salvo com sucesso no XML!");
                } else {
                    System.out.println("Erro ao salvar aluno.");
                }
                scanner.close();
                break;

            case 2:
                System.out.println("Lista de alunos cadastrados:");
                for (Aluno a : alunoDAO.listarTodos()) {
                    System.out.println("Nome: " + a.getNome() + ", Código: " + a.getCod() + ", Curso: " + a.getCurso().getNome_curso());
                }
                scanner.close();
                break;

            case 3:
                System.out.println("Digite o ID do aluno que deseja alterar:");
                int idAlterar = scanner.nextInt();
                scanner.nextLine();

                Aluno alunoAtualizado = new Aluno();
                Curso cursoAtualizado = new Curso();

                System.out.println("Novo nome do aluno:");
                alunoAtualizado.setNome(scanner.nextLine());

                System.out.println("Novo código do aluno:");
                alunoAtualizado.setCod(scanner.nextLine());

                System.out.println("Novo nome do curso:");
                cursoAtualizado.setNome_curso(scanner.nextLine());

                alunoAtualizado.setCurso(cursoAtualizado);

                if (alunoDAO.alterar(idAlterar, alunoAtualizado)) {
                    System.out.println("Aluno atualizado com sucesso!");
                } else {
                    System.out.println("Erro ao atualizar aluno.");
                }
                scanner.close();
                break;

            case 4:
                System.out.println("Digite o ID do aluno que deseja excluir:");
                int idExcluir = scanner.nextInt();

                if (alunoDAO.excluir(idExcluir)) {
                    System.out.println("Aluno excluído com sucesso!");
                } else {
                    System.out.println("Erro ao excluir aluno.");
                }
                scanner.close();
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
