package concat;

import java.util.Scanner;

public class Concat {

	public static String concatString(String string1, String string2) {
	    return string1 + string2;
	}
	
    public static void main(String[] args) {
        String string1, string2;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primera string: ");
        string1 = scanner.nextLine();

        System.out.print("Digite segunda string: ");
        string2 = scanner.nextLine();

        System.out.println("O resultado é: " + concatString(string1, string2));

        scanner.close();
    }
}

