public class Main {
    public static void main(String[] args) {
        // Criando alunos
        Aluno aluno1 = new Aluno("João Silva", "2023001");
        aluno1.cadastrarNota(8.5);
        aluno1.cadastrarNota(7.0);
        aluno1.cadastrarNota(9.2);

        Aluno aluno2 = new Aluno("Maria Souza", "2023002");
        aluno2.cadastrarNota(6.0);
        aluno2.cadastrarNota(5.5);
        aluno2.cadastrarNota(7.0);
        aluno2.cadastrarNota(6.5);

        Aluno aluno3 = new Aluno("Pedro Alves", "2023003");
        aluno3.cadastrarNota(9.5);
        aluno3.cadastrarNota(9.8);
        aluno3.cadastrarNota(10.0);

        Aluno aluno4 = new Aluno("Ana Clara", "2023004");
        aluno4.cadastrarNota(4.0);
        aluno4.cadastrarNota(5.0);
        aluno4.cadastrarNota(6.0);

        // Criando uma turma com capacidade para 5 alunos
        Turma turmaA = new Turma(5);

        // Adicionando alunos à turma
        turmaA.adicionarAluno(aluno1);
        turmaA.adicionarAluno(aluno2);
        turmaA.adicionarAluno(aluno3);
        turmaA.adicionarAluno(aluno4);

        // Listando alunos aprovados e reprovados
        turmaA.listarAprovados();
        turmaA.listarReprovados();
    }
}