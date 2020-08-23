package lanchonete;

public class Massa extends Lanche{

	private TipoMolho molho;
	private TipoMassa massa;
	
	
	public Massa() {
		setTempoPreparo(30);
		setPreco(13.99);
	}

	
	public TipoMassa getMassa() {
		return massa;
	}

	public void setMassa(TipoMassa massa) {
		this.massa = massa;
	}


	public TipoMolho getMolho() {
		return molho;
	}


	public void setMolho(TipoMolho molho) {
		this.molho = molho;
	}	
	
}
