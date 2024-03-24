import java.util.Scanner;

public class onze {
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
        int soma = 0;
        for (int i = numero1; i <= numero2; i++) {
            System.out.println(i);
            soma += i;
        }

        System.out.println("A soma dos números no intervalo é: " + soma);

        scanner.close();
    }
}
