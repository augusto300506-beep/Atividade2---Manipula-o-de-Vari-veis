package AtividadesVariaveis2;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        System.out.println("===> PAR OU ÍMPAR <===");

        Scanner sc = new Scanner(System.in);

        System.out.println("Usuario digita um número: ");
        int user = sc.nextInt();

        if (user % 2 == 0) {
            System.out.println("Numero " + user + " é par.");

        } else {
            System.out.println("Numero " + user + " é impar.");
        }
        sc.close();
    }
}
