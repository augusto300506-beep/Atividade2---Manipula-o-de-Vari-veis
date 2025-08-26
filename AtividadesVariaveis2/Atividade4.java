package AtividadesVariaveis2;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        System.out.println("===> VERIFICAÇÃO DE LOGIN <===");

        String usuarioCorreto = "Gabriel";
        String senhaCorreto = "123456";

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Usuario: ");
        String usuarioDigitado = sc.nextLine();

        System.out.println("Senha do Usuario: ");
        String senhaDigitado = sc.nextLine();

        if (usuarioDigitado.equals(senhaDigitado)) {
            System.out.println("Login efetuado com sucesso!");

        } else {
            System.out.println("Login ou senha incorreto!");
        }
        sc.close();
    }
}
