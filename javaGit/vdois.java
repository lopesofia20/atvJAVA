import java.util.Scanner;

public class vdois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (verificarPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo. É divisível por:");
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
    }

    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

