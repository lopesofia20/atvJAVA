import java.util.Scanner;

public class qdois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervalo0a25 = 0, intervalo26a50 = 0, intervalo51a75 = 0, intervalo76a100 = 0;

        System.out.println("Digite uma quantidade indeterminada de números positivos (digite um número negativo para encerrar):");

        while (true) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; 
            }

            if (numero >= 0 && numero <= 25) {
                intervalo0a25++;
            } else if (numero >= 26 && numero <= 50) {
                intervalo26a50++;
            } else if (numero >= 51 && numero <= 75) {
                intervalo51a75++;
            } else if (numero >= 76 && numero <= 100) {
                intervalo76a100++;
            }
        }

        System.out.println("\nQuantidade de números nos intervalos:");
        System.out.println("[0-25]: " + intervalo0a25);
        System.out.println("[26-50]: " + intervalo26a50);
        System.out.println("[51-75]: " + intervalo51a75);
        System.out.println("[76-100]: " + intervalo76a100);

        scanner.close();
    }
}
