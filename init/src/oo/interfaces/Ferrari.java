package oo.interfaces;

public class Ferrari extends Carro implements Esportivo, Luxo {
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	Ferrari() {
		this(350);
	}
	
	Ferrari(int velMax) {	// Se não for passado nenhum parâmetro o padrão será utilizado, que terá a velocidade de 350km/h
		super(velMax);
		setDelta(30);
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	public int setDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		}
		
		return 20;
	}
	
}
