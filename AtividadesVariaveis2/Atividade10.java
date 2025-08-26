package AtividadesVariaveis2;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {

        System.out.println("===> CÁLCULO DE DESCONTO PROGRESSIVO <===");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Preço Unitário do Produto: ");
        double precoUnitario = sc.nextDouble();

        System.out.println("Digite a Quantidade de Itens: ");
        int quantidade = sc.nextInt();

        double totalSemDesconto = precoUnitario * quantidade;

        double percentualDesconto = 0.5;

        if (quantidade >= 15) {
            percentualDesconto = 0.15;
        } else if (quantidade >= 10) {
            percentualDesconto = 0.10;
        } else if (quantidade >= 5) {
            percentualDesconto = 0.05;
        }

        double valorDesconto = totalSemDesconto * percentualDesconto;
        double totalComDesconto = totalSemDesconto - valorDesconto;

        System.out.println("Total sem Desconto: R$ " + totalSemDesconto);
        System.out.println("Desconto Aplicado: " + percentualDesconto * 100 + "%");
        System.out.println("Valor do Desconto: R$ " + valorDesconto);
        System.out.println("Total com Desconto: R$ " + totalComDesconto);

        sc.close();
    }
}
