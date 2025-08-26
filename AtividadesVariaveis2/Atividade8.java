package AtividadesVariaveis2;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {

        System.out.println("===> CLASSIFICAÇÃO DE TEMPERATURA <===");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double temperatura = sc.nextDouble();

        String classificacao;

        if (temperatura < 10) {
            classificacao = "Muito frio";
        } else if (temperatura >= 10 && temperatura < 20) {
            classificacao = "Frio";
        } else if (temperatura >= 20 && temperatura < 30) {
            classificacao = "Morno";
        } else if (temperatura >= 30 && temperatura < 40) {
            classificacao = "Quante";
        } else {
            classificacao = "Muito Quente";
        }

        System.out.println("Classificação: " + classificacao);
    }
}
