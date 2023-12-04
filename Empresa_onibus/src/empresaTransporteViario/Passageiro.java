package empresaTransporteViario;

public class Passageiro extends Pessoa {
	private Cartao cartao;
    
	public Passageiro(Cartao cartao, String nome, String cpf) {
		super(nome, cpf);
		this.cartao = cartao;
	}

	public Cartao getCartao() {
		
	}

	public void setCartao(Cartao cartao) {
		
	}
}
