package Repeticao51;

import java.util.Scanner;

public class VSete {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de turmas: ");
        int quantidadeTurmas = scanner.nextInt();

        int totalAlunos = 0;
        for (int i = 1; i <= quantidadeTurmas; i++) {
            int quantidadeAlunos;
            do {
                System.out.print("Digite a quantidade de alunos na turma " + i + " (máximo 40): ");
                quantidadeAlunos = scanner.nextInt();
                if (quantidadeAlunos > 40) {
                    System.out.println("A quantidade de alunos na turma não pode ser superior a 40.");
                }
            } while (quantidadeAlunos > 40);

            totalAlunos += quantidadeAlunos;
        }

        double mediaAlunosPorTurma = (double) totalAlunos / quantidadeTurmas;

        System.out.println("O número médio de alunos por turma é: " + mediaAlunosPorTurma);

        scanner.close();
    }
}
