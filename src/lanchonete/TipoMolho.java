package lanchonete;

public enum TipoMolho {

	BRANCO(1), VERMELHO(2), MISTO(3);
	
	private final int valor;
	
	TipoMolho(int valorOpcao){
		valor = valorOpcao;
	}

	public int getValor() {
		return valor;
	}
	
}
