package AtividadesVariaveis2;

import javax.swing.*;
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        System.out.println("===> VERIFICAÇÃO DE DIAS DA SEMANA (EXTRA) <===");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero entre 1 e 7: ");
        int numeroDia = sc.nextInt();

        switch (numeroDia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
                case 2:
                    System.out.println("Tercea-feira");
                    break;
                    case 3:
                        System.out.println("Quarta-feira");
                        break;
                        case 4:
                        System.out.println("Quinta-feira");
                        break;
                        case 5:
                            System.out.println("Sexta-feira");
                            break;
                            case 6:
                                System.out.println("Sábado");
                                break;
                                case 7:
                                    System.out.println("Domingo");
                                    break;
                                    default:
                                        System.out.println("Número Invalido!");
        }
        sc.close();
    }
}
