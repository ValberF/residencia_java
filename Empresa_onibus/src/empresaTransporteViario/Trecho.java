package empresaTransporteViario;

import java.util.ArrayList;

public class Trecho {
	private PontoParada origem;
    private PontoParada destino;
    private int intervalo;
    private ArrayList<Passageiro> passageirosEmbarcados;
    
	public Trecho(PontoParada origem, PontoParada destino, int intervalo) {
		this.origem = origem;
		this.destino = destino;
		this.intervalo = intervalo;
		this.passageirosEmbarcados = new ArrayList<>();
	}

	public PontoParada getOrigem() {
		
	}

	public void setOrigem(PontoParada origem) {
		
	}

	public PontoParada getDestino() {
		
	}

	public void setDestino(PontoParada destino) {
		
	}

	public int getIntervalo() {
		
	}

	public void setIntervalo(int intervalo) {

	}
	
	// Recebe um passageiro como parâmetro e adiciona na lista de passageiros embarcados 
	public void registrarEmbarque(Passageiro passageiro) {

    }
}
