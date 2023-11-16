package produtoEletronico;

import java.util.Scanner;

public class ProdutoEletronico {
    private String nome;
    private String marca;
    private double preco;
    private boolean ligado;

    public ProdutoEletronico(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.ligado = false;
    }
    
    public String getNome() {
    	return nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public String getMarca() {
    	return marca;
    }
    
    public void setMarca(String marca) {
    	this.marca = marca;
    }
    
    public double getPreco() {
    	return preco;
    }
    
    public void setPreco(double preco) {
    	this.preco = preco;
    }

    public void ligar() {
        ligado = true;
        System.out.println(nome + " está ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println(nome + " está desligado.");
    }

	public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }
	
	public static void main(String[] args) {
		String nome, marca;
		double preco;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		nome = sc.nextLine();
		System.out.println("Digite a marca do produto: ");
		marca = sc.nextLine();
		System.out.println("Digite o preco do produto: ");
		preco = sc.nextDouble();
		
		ProdutoEletronico produto = new ProdutoEletronico(nome, marca, preco);
		
		produto.exibirInformacoes();
		produto.ligar();
		produto.exibirInformacoes();
	}
}
