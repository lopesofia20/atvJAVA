package Repeticao51;

public class Trinta {
    public static void main(String[] args) {
        System.out.println("Lojas Quase Dois - Tabela de preços");

        for (int quantidade = 1; quantidade <= 50; quantidade++) {
            double preco = quantidade * 0.18; // Preço é a quantidade de itens multiplicado pelo valor unitário
            System.out.println(quantidade + " - R$ " + String.format("%.2f", preco));
        }
    }
}
