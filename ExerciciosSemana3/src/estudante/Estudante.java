package estudante;

import java.util.Date;
import java.util.Scanner;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.text.SimpleDateFormat;

public class Estudante {
	private String nome, cpf;
	private Date dataNascimento;
	
	public Estudante(String nome, String cpf, Date dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
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

	public String getDataNascimento() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return formatter.format(dataNascimento);
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getAge() {
        Date dataAtual = new Date();
        OffsetDateTime startOdt = this.dataNascimento.toInstant().atOffset(ZoneOffset.UTC);
        OffsetDateTime endOdt = dataAtual.toInstant().atOffset(ZoneOffset.UTC);
        
		return Period.between(startOdt.toLocalDate(), endOdt.toLocalDate()).getYears();
	}
	
	public static void main(String[] args) {
		try {
			String data;
	        Date dataNascimento = new Date();
	        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite a data de nascimento: ");
	        data = scanner.nextLine();
	        
	        dataNascimento = formatter.parse(data);
	        
	        Estudante estudante1 = new Estudante("Valber", "07109001555", dataNascimento);
	        System.out.println("Nome: " + estudante1.getNome() + ", CPF: " + estudante1.getCpf() + 
	        		", Data de Nascimento: " + estudante1.getDataNascimento());
	        System.out.println("Idade: " + estudante1.getAge() + " anos");
		} catch (Exception e) {
			e.printStackTrace();
		}
        
    }
}
