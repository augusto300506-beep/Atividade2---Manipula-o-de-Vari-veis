package AtividadesVariaveis2;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {

        System.out.println("===> VERIFICAÇÃO DE NÚMERO POSITIVO, NEGATIVO OU ZERO <===");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = sc.nextDouble();

        if (numero > 0) {
            System.out.println("O número é positivo");

        } else if (numero < 0) {
            System.out.println("O número é negativo");
            
        } else {
            System.out.println("O número é zero");
        }
        sc.close();
    }
}
