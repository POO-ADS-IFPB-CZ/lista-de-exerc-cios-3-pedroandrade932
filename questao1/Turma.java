class Turma {
    private Aluno[] alunos;
    private int numAlunos;
    private int capacidadeMaxima;

    public Turma(int capacidade) {
        this.capacidadeMaxima = capacidade;
        this.alunos = new Aluno[capacidadeMaxima];
        this.numAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (numAlunos < capacidadeMaxima) {
            this.alunos[numAlunos++] = aluno;
        } else {
            System.out.println("A turma atingiu a capacidade máxima.");
        }
    }

    public void listarAprovados() {
        System.out.println("\nAlunos Aprovados:");
        for (int i = 0; i < numAlunos; i++) {
            if (alunos[i].estaAprovado()) {
                System.out.println("- " + alunos[i].getNome() + " (Matrícula: " + alunos[i].getMatricula() + ", Média: " + String.format("%.2f", alunos[i].calcularMedia()) + ")");
            }
        }
    }

    public void listarReprovados() {
        System.out.println("\nAlunos Reprovados:");
        for (int i = 0; i < numAlunos; i++) {
            if (!alunos[i].estaAprovado()) {
                System.out.println("- " + alunos[i].getNome() + " (Matrícula: " + alunos[i].getMatricula() + ", Média: " + String.format("%.2f", alunos[i].calcularMedia()) + ")");
            }
        }
    }
}

