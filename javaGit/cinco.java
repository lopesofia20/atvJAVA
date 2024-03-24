import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("Informe a população inicial do país A:");
            int populacaoA = solicitarNumeroPositivo(scanner);
            System.out.println("Informe a taxa de crescimento anual do país A (em decimal):");
            double taxaCrescimentoA = solicitarTaxa(scanner);

            System.out.println("Informe a população inicial do país B:");
            int populacaoB = solicitarNumeroPositivo(scanner);
            System.out.println("Informe a taxa de crescimento anual do país B (em decimal):");
            double taxaCrescimentoB = solicitarTaxa(scanner);

            int anos = calcularAnos(populacaoA, taxaCrescimentoA, populacaoB, taxaCrescimentoB);

            System.out.println("Número de anos necessários: " + anos);

            System.out.println("Deseja repetir a operação? (s/n)");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        scanner.close();
    }

    private static int solicitarNumeroPositivo(Scanner scanner) {
        int numero;
        do {
            System.out.print("Número deve ser positivo. Tente novamente: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, insira um número válido: ");
                scanner.next();
            }
            numero = scanner.nextInt();
        } while (numero <= 0);
        return numero;
    }

    private static double solicitarTaxa(Scanner scanner) {
        double taxa;
        do {
            System.out.print("Taxa de crescimento deve estar entre 0 e 1. Tente novamente: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Por favor, insira uma taxa válida: ");
                scanner.next();
            }
            taxa = scanner.nextDouble();
        } while (taxa <= 0 || taxa >= 1);
        return taxa;
    }

    private static int calcularAnos(int populacaoA, double taxaCrescimentoA, int populacaoB, double taxaCrescimentoB) {
        int anos = 0;
        while (populacaoA <= populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }
        return anos;
    }
}
