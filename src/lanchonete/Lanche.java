package lanchonete;

public abstract class Lanche {

	private double preco;
	private int tempoPreparo;
	private double tempoEntrega;
	
	public double getTempoEntrega() {
		return tempoEntrega;
	}

	public void setTempoPreparo(int tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	
	public void calcularTempoDeEntrega(int distancia) {
		tempoEntrega += (tempoPreparo + (10 * distancia));
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
}
