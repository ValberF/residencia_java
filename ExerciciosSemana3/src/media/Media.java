package media;

import java.util.Scanner;

public class Media {

	public static float mediaPonderada(float nota1, float nota2, float nota3, int peso1, int peso2, int peso3) {
	    return ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
	}
	
    public static void main(String[] args) {
        float nota1, nota2, nota3;
        int peso1, peso2, peso3;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primera nota: ");
        nota1 = scanner.nextFloat();

        System.out.print("Digite o primeiro peso: ");
        peso1 = scanner.nextInt();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextFloat();

        System.out.print("Digite o segundoo peso: ");
        peso2 = scanner.nextInt();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextFloat();

        System.out.print("Digite o terceiro peso: ");
        peso3 = scanner.nextInt();

        System.out.println("O resultado é: " + mediaPonderada(nota1, nota2, nota3, peso1, peso2, peso3));

        scanner.close();
    }
}
