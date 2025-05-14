import java.util.Arrays;

class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;
    private int numNotas;
    private static final int MAX_NOTAS = 4;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[MAX_NOTAS];
        this.numNotas = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return Arrays.copyOf(notas, numNotas); // Retorna uma cópia para evitar modificação externa
    }

    public void cadastrarNota(double nota) {
        if (numNotas < MAX_NOTAS) {
            this.notas[numNotas++] = nota;
        } else {
            System.out.println("Número máximo de notas atingido para o aluno " + nome);
        }
    }

    public double calcularMedia() {
        if (numNotas == 0) {
            return 0.0;
        }
        double soma = 0;
        for (int i = 0; i < numNotas; i++) {
            soma += notas[i];
        }
        return soma / numNotas;
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }
}

