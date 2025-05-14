import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MegaSena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numerosMegaSena = new int[6];
        Set<Integer> numerosInseridos = new HashSet<>();
        int contador = 0;

        System.out.println("Digite 6 números distintos para a Mega-Sena (de 1 a 60):");

        while (contador < 6) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                if (numero >= 1 && numero <= 60) {
                    if (numerosInseridos.add(numero)) {
                        numerosMegaSena[contador++] = numero;
                    } else {
                        System.out.println("Número duplicado. Por favor, digite um número diferente.");
                    }
                } else {
                    System.out.println("Número inválido. Digite um número entre 1 e 60.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpar o buffer do scanner
            }
        }

        Arrays.sort(numerosMegaSena);

        System.out.println("\nSeus números da Mega-Sena em ordem crescente são:");
        for (int numero : numerosMegaSena) {
            System.out.print(numero + " ");
        }
        System.out.println();

        scanner.close();
    }
}