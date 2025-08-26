package AtividadesVariaveis2;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {

        System.out.println("===> VERIFICAÇÃO DE APROVAÇÃO ESCOLAR <===");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a média final do Aluno: ");
        double alunoDigitado = sc.nextDouble();

        if (alunoDigitado >= 7) {
            System.out.println("Aluno Aprovado!");

        } else if (alunoDigitado >= 5 && alunoDigitado < 7) {
            System.out.println("Aluno em Recuperação!");

        } else {
            System.out.println("Aluno Reprovado!");
        }
        sc.close();
    }
};

