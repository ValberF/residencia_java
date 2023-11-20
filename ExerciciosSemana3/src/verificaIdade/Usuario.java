package verificaIdade;

import java.util.Scanner;

public class Usuario {
	private int idade;
	
	public Usuario(int idade) {
		super();
		this.idade = idade;
	}

	public String checaIdade() {
	    return idade >= 18 ? "é de maior!" : "é de menor!";
	}
	
	public static int calculaIdade(int dia, int mes, int ano, int diaAtual, int mesAtual, int anoAtual) {
		int idade = anoAtual - ano;
		
		if (mesAtual < mes || mesAtual == mes && diaAtual < dia) {
	        idade--;
	    }
		
	    return idade;
	}

    public static void main(String[] args) {
        int idade, dia, mes, ano, diaAtual, mesAtual, anoAtual;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        idade = scanner.nextInt();
        
        Usuario usuario1 = new Usuario(idade);
        
        System.out.println("O Usuario " + usuario1.checaIdade());

        System.out.print("Digite a dia de nascimento: ");
        dia = scanner.nextInt();
        
        System.out.print("Digite a mes de nascimento: ");
        mes = scanner.nextInt();
        
        System.out.print("Digite a ano de nascimento: ");
        ano = scanner.nextInt();
        
        System.out.print("Digite a dia atual: ");
        diaAtual = scanner.nextInt();
        
        System.out.print("Digite a mes atual: ");
        mesAtual = scanner.nextInt();
        
        System.out.print("Digite a ano atual: ");
        anoAtual = scanner.nextInt();
        
        System.out.println("O Usuario tem " + calculaIdade(dia, mes, ano, diaAtual, mesAtual, anoAtual) + " anos.");
        
        scanner.close();
    }
}
