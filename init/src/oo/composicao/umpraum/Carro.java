package oo.composicao.umpraum;

public class Carro {
	Motor motor = new Motor();

	void acelerar() {
		if (motor.fatorInjecao < 2.6) motor.fatorInjecao += 0.4;  // ifs não deixam acelerar demais e nem de menos
	}

	void frear() {
		if (motor.fatorInjecao > 0.5) motor.fatorInjecao -= 0.4;
	}

	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean ligado() {
		return motor.ligado;
	}
}
