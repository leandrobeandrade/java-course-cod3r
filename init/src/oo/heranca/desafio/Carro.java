package oo.heranca.desafio;

public class Carro {
	int velocidadeAtual = 0;
	final int VELOCIDADE_MAXIMA;
	
	Carro (int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if (velocidadeAtual < VELOCIDADE_MAXIMA) {
			velocidadeAtual += 10;
		} else {
			System.out.println("Automóvel já atingiu a velocidade máxima!");
		}
	}
	
	void frear() {
		if (velocidadeAtual > 0) {
			velocidadeAtual -= 10;
		} else {
			System.out.println("Automóvel já está parado!");
		}
	}
}
