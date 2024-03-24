package Repeticao51;

import java.util.Scanner;

public class VSeis {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        int[] votos = new int[3]; // Array para armazenar os votos dos candidatos (índices: 0, 1, 2)

        for (int i = 0; i < totalEleitores; i++) {
            System.out.println("Eleitor " + (i + 1) + ":");
            System.out.println("Digite o número do candidato (1, 2 ou 3): ");
            int voto = scanner.nextInt();

            // Verificar se o voto é válido (1, 2 ou 3)
            if (voto >= 1 && voto <= 3) {
                // Incrementar o número de votos para o candidato correspondente
                votos[voto - 1]++;
            } else {
                System.out.println("Voto inválido! Por favor, vote novamente.");
                i--; // Decrementar i para permitir que o eleitor vote novamente
            }
        }

        // Exibir o número de votos de cada candidato
        System.out.println("Resultado da Eleição:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votos[i] + " votos");
        }

        scanner.close();
    }
}
