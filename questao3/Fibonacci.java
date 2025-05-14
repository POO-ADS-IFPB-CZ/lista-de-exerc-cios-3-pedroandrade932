import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números da série de Fibonacci que você deseja ver: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            int[] fibonacciSeries = gerarFibonacci(n);
            System.out.println(Arrays.toString(fibonacciSeries));
        }

        scanner.close();
    }

    public static int[] gerarFibonacci(int n) {
        if (n == 1) {
            return new int[]{0};
        } else if (n == 2) {
            return new int[]{0, 1};
        } else {
            int[] fibonacci = new int[n];
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
            return fibonacci;
        }
    }
}