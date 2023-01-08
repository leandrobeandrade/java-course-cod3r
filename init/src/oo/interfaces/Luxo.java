package oo.interfaces;

public interface Luxo {
	void ligarAr();
	void desligarAr();
	
	// Torna o método não obrigatório suas implementação
	default int velocidadeAr() {
		return 1;
	}
}
