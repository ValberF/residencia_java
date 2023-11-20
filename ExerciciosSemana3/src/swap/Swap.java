package swap;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número 1: ");
        num1 = scanner.nextInt();
        
        System.out.print("Digite o número 2: ");
        num2 = scanner.nextInt();
        
        System.out.println("Antes número 1: " + num1 + ", número 2: " + num2);
        
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        
        System.out.println("Depois número 1: " + num1 + ", número 2: " + num2);

        scanner.close();
    }
}
