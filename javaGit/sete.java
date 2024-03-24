import java.util.Scanner;

public class sete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 números:");
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }
        
        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
