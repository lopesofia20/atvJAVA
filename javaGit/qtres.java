import java.util.Scanner;

public class qtres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cardápio da lanchonete
        String[] itens = {"Cachorro Quente", "Bauru Simples", "Bauru com ovo",
                          "Hambúrguer", "Cheeseburguer", "Refrigerante"};
        double[] precos = {1.20, 1.30, 1.50, 1.20, 1.30, 1.00};

        // Variável para armazenar o total geral do pedido
        double totalGeral = 0;

        System.out.println("Cardápio:");
        for (int i = 0; i < itens.length; i++) {
            System.out.println((i + 100) + " - " + itens[i] + ": R$ " + precos[i]);
        }

        // Loop para leitura dos itens pedidos e quantidades
        while (true) {
            System.out.print("\nDigite o código do item (ou -1 para encerrar o pedido): ");
            int codigo = scanner.nextInt();

            // Verifica se o pedido deve ser encerrado
            if (codigo == -1) {
                break;
            }

            if (codigo < 100 || codigo > 105) {
                System.out.println("Código inválido. Tente novamente.");
                continue;
            }

            System.out.print("Digite a quantidade desejada: ");
            int quantidade = scanner.nextInt();

            // Calcula e exibe o valor a ser pago por item
            double valorItem = precos[codigo - 100] * quantidade;
            System.out.println("Valor a ser pago por " + itens[codigo - 100] + ": R$ " + valorItem);

            // Atualiza o total geral do pedido
            totalGeral += valorItem;
        }

        // Exibe o total geral do pedido
        System.out.println("\nTotal geral do pedido: R$ " + totalGeral);

        scanner.close();
    }
}
