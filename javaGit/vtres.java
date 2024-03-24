import java.util.Scanner;

public class vtres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para encontrar os números primos até ele: ");
        int n = scanner.nextInt();

        int divisoes = 0;

        System.out.println("Números primos entre 1 e " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean ehPrimo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                divisoes++; 
                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNúmero total de divisões executadas: " + divisoes);

        scanner.close();
    }
}
