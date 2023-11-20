package temperatura;

import java.util.Scanner;

public class Temperatura {
	public static float celsiusToFahrenheit(float num) {
	    return (num * 9/5) + 32;
	}
	
	public static double fahrenheitToCelsius(float num) {
	    return (num - 32) / 1.8;
	}
	
    public static void main(String[] args) {
        float num;
        int opcao;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número: ");
        num = scanner.nextFloat();
        
        System.out.println("Escolha a conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        
        opcao = scanner.nextInt();
        
        switch(opcao) {
        	case 1:
        		System.out.println(num + " ºC é igual a " + celsiusToFahrenheit(num) + " ºF");
        		break;
        	case 2:
        		System.out.println(num + " ºF é igual a " + fahrenheitToCelsius(num) + " ºC");
        		break;
        	default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}