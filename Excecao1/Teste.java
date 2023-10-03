package Excecao1;

public class Teste {
    public static void main(String[] args) {
        CadastroAluno[] alunos = new CadastroAluno[40];

        try {
            adicionarAluno(alunos, new CadastroAluno("Diego", "Rua x", "33333"));
            adicionarAluno(alunos, new CadastroAluno("Sena", "Rua y", "29403"));
            adicionarAluno(alunos, new CadastroAluno("Silva", "Rua z", "33333"));

            listarAlunos(alunos);
        } catch (MatriculaDuplicadaException e) {
            System.err.println("Erro no cadastro : " + e.getMessage());
        }
    }

    public static void adicionarAluno(CadastroAluno[] alunos, CadastroAluno novoAluno) throws MatriculaDuplicadaException {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getMatricula().equals(novoAluno.getMatricula())) {
                throw new MatriculaDuplicadaException(novoAluno.getMatricula());
            }
            if (alunos[i] == null) {
                alunos[i] = novoAluno;
                System.out.println("Cadastro realizado com sucesso -> Nome: " +novoAluno.getNome()+ " | Matrícula: " +novoAluno.getMatricula());
                return;
            }
        }
    }

    public static void listarAlunos(CadastroAluno[] alunos) {
        System.out.println("Lista de Alunos:");
        for (CadastroAluno aluno : alunos) {
            if (aluno != null) {
                System.out.println(aluno);
            }
        }
    }
}