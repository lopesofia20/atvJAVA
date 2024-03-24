package Repeticao51;

import java.util.Scanner;

public class TNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAlunoMaisAlto = 0, numeroAlunoMaisBaixo = 0;
        int alturaAlunoMaisAlto = Integer.MIN_VALUE, alturaAlunoMaisBaixo = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número do aluno " + i + ": ");
            int numeroAluno = scanner.nextInt();

            System.out.print("Digite a altura do aluno " + i + " (em centímetros): ");
            int alturaAluno = scanner.nextInt();

            if (alturaAluno > alturaAlunoMaisAlto) {
                alturaAlunoMaisAlto = alturaAluno;
                numeroAlunoMaisAlto = numeroAluno;
            }

            if (alturaAluno < alturaAlunoMaisBaixo) {
                alturaAlunoMaisBaixo = alturaAluno;
                numeroAlunoMaisBaixo = numeroAluno;
            }
        }

        System.out.println("Aluno mais alto: Número " + numeroAlunoMaisAlto + ", Altura " + alturaAlunoMaisAlto + " centímetros");
        System.out.println("Aluno mais baixo: Número " + numeroAlunoMaisBaixo + ", Altura " + alturaAlunoMaisBaixo + " centímetros");

        scanner.close();
    }
}
