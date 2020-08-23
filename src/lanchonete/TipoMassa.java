package lanchonete;

public enum TipoMassa {

	MACARRAO(1), PIZZA(2), LASANHA(3);
	
	private final int valor;
	
	TipoMassa(int valorOpcao){
		valor = valorOpcao;
	}

	public int getValor() {
		return valor;
	}
	
}
