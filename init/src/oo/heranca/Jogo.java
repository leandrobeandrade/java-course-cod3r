package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		Jogador monstro = new Jogador();
//		Jogador heroi = new Jogador();
		Jogador heroi = new Heroi();
		
		monstro.x = 10;
		monstro.y = 10;
		
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println("Monstro tem " + monstro.vida);
		System.out.println("Herói tem " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.println("Monstro tem " + monstro.vida);
		System.out.println("Herói tem " + heroi.vida);
	}

}
