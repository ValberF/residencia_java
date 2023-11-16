package cliente;

import java.util.Scanner;

public class Cliente {
	private String nome, cpf;
	private int idade;

	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.idade = 0;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public static void main(String[] args) {
		String nome, cpf;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do cliente: ");
		nome = sc.nextLine();
		System.out.println("Digite o cpf do cliente: ");
		cpf = sc.nextLine();
		
		Cliente cliente1 = new Cliente(nome, cpf);
		
		System.out.println("Nome: " + cliente1.getNome() + " " + "CPF: " + cliente1.getCpf());
		
		System.out.println("Altere os dados!");
		
		System.out.println("Digite o nome do cliente: ");
		nome = sc.nextLine();
		System.out.println("Digite o cpf do cliente: ");
		cpf = sc.nextLine();
		
		cliente1.setNome(nome);
		cliente1.setCpf(cpf);
		
		System.out.println("Nome: " + cliente1.getNome() + " " + "CPF: " + cliente1.getCpf());
	}
}
