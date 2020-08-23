package lanchonete;

public class Sanduiche extends Lanche{

	private String[] ingredientes = new String[10];
	
	public Sanduiche() {
		setTempoPreparo(15);
		setPreco(31.99);
	}
}
