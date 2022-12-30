package oo.composicao.umpraum;

public class Motor {
	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giros() {
		if (!ligado) {
			return 0;
		} else {
			return 1;
		}
	}
}
