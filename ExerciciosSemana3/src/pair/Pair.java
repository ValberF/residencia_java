package pair;

import java.util.Scanner;

public class Pair {
	public static String isPair(int num) {
	    return num % 2 == 0 ? "Par" : "Ímpar";
	}
	
    public static void main(String[] args) {
        int num;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número: ");
        num = scanner.nextInt();

        System.out.println("O número " + num + " é " + isPair(num));

        scanner.close();
    }
}
