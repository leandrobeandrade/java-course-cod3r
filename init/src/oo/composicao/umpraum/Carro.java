package oo.composicao.umpraum;

public class Carro {
	Motor motor = new Motor();

	void acelerar() {
		motor.fatorInjecao += 0.4;
	}

	void frear() {
		motor.fatorInjecao -= 0.4;
	}
}
