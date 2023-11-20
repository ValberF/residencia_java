package rectangle;

import java.util.Scanner;

public class Rectangle {
	public static float calculaArea(float width, float height) {
	    return width * height;
	}

    public static void main(String[] args) {
        float width, height;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        height = scanner.nextFloat();
        
        System.out.print("Digite a largura: ");
        width = scanner.nextFloat();
        
        System.out.println("A altura do retângulo é " + calculaArea(width, height));

        scanner.close();
    }
}
