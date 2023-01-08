package oo.interfaces;

public class Sistema {

	public static void main(String[] args) {
		Carro ferrari = new Ferrari();
		Carro civic = new Civic();
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println("Velocidade Ferrari " + ferrari.velocidadeAtual + "KM/h");
		System.out.println("Velocidade Civic " + civic.velocidadeAtual);
		
		System.out.println("\nFreei 1 vez o Civic");
		civic.frear();
		System.out.println("Velocidade Civic " + civic.velocidadeAtual + "KM/h");
		
		System.out.println("\nFreei 3 vezes o Civic");
		civic.frear();
		civic.frear();
		civic.frear();
		System.out.println("Velocidade Civic " + civic.velocidadeAtual + "KM/h");
		
		System.out.println("\nFreei 2 vez o Civic");
		civic.frear();
		civic.frear();
		System.out.println("Velocidade Civic " + civic.velocidadeAtual + "KM/h");
		
		Ferrari f2 = new Ferrari();
		f2.ligarTurbo();
		
		System.out.println("\nVelocidade Ferrari (2) " + f2.velocidadeAtual);
		System.out.println("\nVelocidade Ar Ferrari (2) " + f2.velocidadeAr());
	}

}
