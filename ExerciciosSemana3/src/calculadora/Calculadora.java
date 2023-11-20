package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static double adicao(double a, double b) {
	    return a + b;
	}

	public static double subtracao(double a, double b) {
	    return a - b;
	}

	public static double multiplicacao(double a, double b) {
	    return a * b;
	}

	public static double divisao(double a, double b) {
	    return a / b;
	}
	
    public static void main(String[] args) {
    	char opcao;
        double resultado = 0, num1, num2;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("A - Adição");
        System.out.println("S - Subtração");
        System.out.println("M - Multiplicação");
        System.out.println("D - Divisão");
        
        opcao = scanner.next().charAt(0);

        switch (opcao) {
            case 'A':
                resultado = adicao(num1, num2);
                break;
            case 'S':
                resultado = subtracao(num1, num2);
                break;
            case 'M':
                resultado = multiplicacao(num1, num2);
                break;
            case 'D':
                if (num2 != 0) {
                    resultado = divisao(num1, num2);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        System.out.println("O resultado é: " + resultado);

        scanner.close();
    }
}
