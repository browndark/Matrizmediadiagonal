import java.util.Scanner;
public class N1 {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("Professor: Ricardo");
        System.out.println("Aluno: Bruno Custodio de castro Silva");
        System.out.println("=========================================");
        Scanner scanner = new Scanner(System.in);
        final int NUM_ALUNOS = 3;

        String[] nomes = new String[NUM_ALUNOS];
        double[][] notas = new double[NUM_ALUNOS][2];
        for (int i = 0; i < NUM_ALUNOS; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();

            System.out.println("Digite a nota 1 do aluno " + nomes[i] + ":");
            notas[i][0] = scanner.nextDouble();

            System.out.println("Digite a nota 2 do aluno " + nomes[i] + ":");
            notas[i][1] = scanner.nextDouble();

            scanner.nextLine();
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < NUM_ALUNOS; i++) {
            double media = (notas[i][0] + notas[i][1]) / 2;
            String status = media >= 6.0 ? "Aprovado" : "Reprovado";

            System.out.printf("Aluno: %s%n", nomes[i]);
            System.out.printf("Nota 1: %.2f%n", notas[i][0]);
            System.out.printf("Nota 2: %.2f%n", notas[i][1]);
            System.out.printf("Média: %.2f%n", media);
            System.out.printf("Status: %s%n%n", status);
        }

        scanner.close();
    }
}

