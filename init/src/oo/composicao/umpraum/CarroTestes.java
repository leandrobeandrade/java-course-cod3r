package oo.composicao.umpraum;

public class CarroTestes {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		System.out.println(carro.ligado());
		carro.ligar();
		System.out.println(carro.ligado());
		System.out.println("Giros " + carro.motor.giros());	// Composição -> acessou um método de uma classe através de outra classe
		
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		System.out.println("Giros " + carro.motor.giros());
		
		carro.frear();
		carro.frear();
		System.out.println("Giros " + carro.motor.giros());
	}

}
