import java.util.Scanner;

public class treze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        double resultado = calcularPotencia(base, expoente);

        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);

        scanner.close();
    }

    public static double calcularPotencia(double base, int expoente) {
        double resultado = 1;

        if (expoente < 0) {
            base = 1 / base;
            expoente = -expoente;
        }
        
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}
