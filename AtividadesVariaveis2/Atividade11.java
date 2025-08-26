package AtividadesVariaveis2;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {

        System.out.println("===> SISTEMA DE CÁLCULO DE SALÁRIO COM BONIFICAÇÃO E IMPOSTOS <===");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Salário base (R$): ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Bonificação (R$): ");
        double bonificacao = scanner.nextDouble();

        System.out.print("Percentual de imposto (%): ");
        double percentualImposto = scanner.nextDouble();

        double salarioBruto = salarioBase + bonificacao;
        double descontoImposto = (percentualImposto / 100) * salarioBruto;
        double salarioLiquido = salarioBruto - descontoImposto;

        System.out.println("--- RESUMO DO SALÁRIO ---");
        System.out.println("Funcionário: " + nome);
        System.out.printf("Salário Base: R$ %.2f%n", salarioBase);
        System.out.printf("Bonificação: R$ %.2f%n", bonificacao);
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Imposto (%.1f%%): R$ %.2f%n", percentualImposto, descontoImposto);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}


