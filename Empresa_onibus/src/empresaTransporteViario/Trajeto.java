package empresaTransporteViario;
import java.util.ArrayList;

public class Trajeto {
	private ArrayList<Trecho> trechos;
    private ArrayList<PontoParada> checkpoints;
    
	public Trajeto(ArrayList<Trecho> trechos, ArrayList<PontoParada> checkpoints) {
		this.trechos = trechos;
		this.checkpoints = checkpoints;
	}

	public ArrayList<Trecho> getTrechos() {
		
	}

	public void setTrechos(ArrayList<Trecho> trechos) {
		
	}

	public ArrayList<PontoParada> getCheckpoints() {
	
	}

	public void setCheckpoints(ArrayList<PontoParada> checkpoints) {
	
	}
	
	public void iniciarTrajeto() {
        
    }
	
	// Recebe um pontoParada como parâmetro e adiciona na lista de checkpoints
	public void registrarCheckpoint(PontoParada pontoParada) {

    }
}
