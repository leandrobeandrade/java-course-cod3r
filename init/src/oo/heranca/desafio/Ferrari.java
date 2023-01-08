package oo.heranca.desafio;

public class Ferrari extends Carro {
	Ferrari() {
		this(350);
	}
	
	Ferrari(int velMax) {	// Se não for passado nenhum parâmetro o padrão será utilizado, que terá a velocidade de 350km/h
		super(velMax);
	}
	
	@Override
	void acelerar() {
		velocidadeAtual += 30;
	}
}
