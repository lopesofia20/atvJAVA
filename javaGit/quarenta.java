import java.util.Scanner;

public class quarenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCidadeMaxAcidentes = 0, codigoCidadeMinAcidentes = 0;
        int maxAcidentes = Integer.MIN_VALUE, minAcidentes = Integer.MAX_VALUE;
        int totalVeiculos = 0, totalCidadesMenos2000 = 0, totalAcidentesMenos2000 = 0;
        int contadorCidadesMenos2000 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Cidade " + i);
            System.out.print("Código da cidade: ");
            int codigoCidade = scanner.nextInt();

            System.out.print("Número de veículos de passeio (em 1999): ");
            int veiculosPasseio = scanner.nextInt();
            totalVeiculos += veiculosPasseio;

            System.out.print("Número de acidentes de trânsito com vítimas (em 1999): ");
            int acidentesTransito = scanner.nextInt();

            if (acidentesTransito > maxAcidentes) {
                maxAcidentes = acidentesTransito;
                codigoCidadeMaxAcidentes = codigoCidade;
            }

            if (acidentesTransito < minAcidentes) {
                minAcidentes = acidentesTransito;
                codigoCidadeMinAcidentes = codigoCidade;
            }

            if (veiculosPasseio < 2000) {
                totalCidadesMenos2000 += veiculosPasseio;
                totalAcidentesMenos2000 += acidentesTransito;
                contadorCidadesMenos2000++;
            }
        }

        System.out.println("\nEstatísticas:");
        System.out.println("Cidade com maior número de acidentes: " + codigoCidadeMaxAcidentes +
                ", Número de acidentes: " + maxAcidentes);
        System.out.println("Cidade com menor número de acidentes: " + codigoCidadeMinAcidentes +
                ", Número de acidentes: " + minAcidentes);

        double mediaVeiculos = (double) totalVeiculos / 5;
        System.out.println("Média de veículos nas cinco cidades: " + mediaVeiculos);

        double mediaAcidentesMenos2000 = 0;
        if (contadorCidadesMenos2000 > 0) {
            mediaAcidentesMenos2000 = (double) totalAcidentesMenos2000 / contadorCidadesMenos2000;
        }
        System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " +
                mediaAcidentesMenos2000);

        scanner.close();
    }
}
