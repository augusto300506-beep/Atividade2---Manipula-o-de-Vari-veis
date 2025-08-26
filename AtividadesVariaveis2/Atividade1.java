package AtividadesVariaveis2;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {

        System.out.println("===> VERIFICAÇÃO DE IDADE <===");

        Scanner Snc = new Scanner(System.in);

        System.out.println("Idade: ");
        int idade = Snc.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");

        } else {
            System.out.println("Menor de idade");
        }
        Snc.close();
    }
}
