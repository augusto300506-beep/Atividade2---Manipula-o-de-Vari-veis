package AtividadesVariaveis2;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {

        System.out.println("===> CALCULADORA BÁSICA <===");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double primeiroNumero = sc.nextDouble();

        System.out.println("Digite a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        System.out.println("Digite o segundo numero: ");
        double segundoNumero = sc.nextDouble();

        double resultado;

        switch (operacao) {
            case '+':
                resultado = primeiroNumero + segundoNumero;
                break;
                case '-':
                    resultado = primeiroNumero - segundoNumero;
                    break;
                    case '*':
                        resultado = primeiroNumero * segundoNumero;
                        break;
                        case '/':
                        if (segundoNumero != 0) {
                            resultado = primeiroNumero / segundoNumero;
                        } else {
                            System.out.println("Erro: Divisão por zero");
                            sc.close();
                            return;
                        }
                        break;
                        default:
                            System.out.println("Operador inválido");
                            sc.close();
                            return;
        }
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
