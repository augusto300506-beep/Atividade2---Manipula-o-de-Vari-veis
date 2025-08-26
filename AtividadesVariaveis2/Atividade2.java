package AtividadesVariaveis2;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        System.out.println("===> CLASSIFICAÇÃO DE NOTAS <===");

        Scanner sc = new Scanner(System.in);

        System.out.println("Nota Aluno entre 0 e 10: ");
        double notaAluno = sc.nextDouble();

        if (notaAluno >= 9) {
            System.out.println("Excelente");

        } else if (notaAluno >= 7) {
            System.out.println("Bom");

        } else if (notaAluno >=5) {
            System.out.println("Satisfatória");

        } else {
            System.out.println("Não satisfatório");
        }
        sc.close();
    }
}
