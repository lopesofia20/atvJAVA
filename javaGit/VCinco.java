package Repeticao51;
import java.util.Scanner;

public class VCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int numPessoas = scanner.nextInt();

        int somaIdades = 0;
        for (int i = 0; i < numPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        double mediaIdade = (double) somaIdades / numPessoas;

        System.out.println("A média de idade da turma é: " + mediaIdade);

        if (mediaIdade >= 0 && mediaIdade <= 25) {
            System.out.println("A turma é jovem.");
        } else if (mediaIdade >= 26 && mediaIdade <= 60) {
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A turma é idosa.");
        }

        scanner.close();
    }
}
