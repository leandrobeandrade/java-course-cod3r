package oo.heranca.desafio;

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
		
	}

}
