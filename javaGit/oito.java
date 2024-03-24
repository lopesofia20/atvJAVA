import java.util.Scanner;

public class oito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 números:");
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / 5;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
