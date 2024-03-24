import java.util.Scanner;

public class dez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        System.out.println("Números no intervalo entre " + numero1 + " e " + numero2 + ":");
        for (int i = numero1; i <= numero2; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
