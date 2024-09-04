import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("Professor: Ricardo ");
        System.out.println("Aluno: Bruno Custodio de castro Silva");
        System.out.println("============================================");
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 5;
        int[][] matriz = new int[SIZE][SIZE];
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nElementos da diagonal principal:");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(matriz[i][i]);
        }

        scanner.close();
    }
}
