package soma;

import java.util.Scanner;

public class Soma {

	public static float somar(float a, float b) {
	    return a + b;
	}
	
    public static void main(String[] args) {
        float num1, num2;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextFloat();

        System.out.println("O resultado é: " + somar(num1, num2));

        scanner.close();
    }
}
