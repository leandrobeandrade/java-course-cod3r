package oo.interfaces;

public class Carro {
	int velocidadeAtual = 0;
	final int VELOCIDADE_MAXIMA;
	private int delta = 10;
	
	Carro (int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public int getDelta() {
		return delta;
	}


	public void setDelta(int delta) {
		this.delta = delta;
	}

	void acelerar() {
		if (velocidadeAtual < VELOCIDADE_MAXIMA) {
			velocidadeAtual += getDelta();
		} else {
			System.out.println("Automóvel já atingiu a velocidade máxima!");
		}
	}
	
	void frear() {
		if (velocidadeAtual > 0) {
			velocidadeAtual -= delta;
		} else {
			System.out.println("Automóvel já está parado!");
		}
	}
}
