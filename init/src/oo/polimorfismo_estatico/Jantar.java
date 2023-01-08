package oo.polimorfismo_estatico;

public class Jantar {

	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(99.65);
		Arroz igrediente1 = new Arroz(0.2);
		Feijao igrediente2 = new Feijao(0.1);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(igrediente1);
		convidado.comer(igrediente2);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sorvete = new Sorvete(0.4);
		convidado.comer(sorvete);
		
		System.out.println(convidado.getPeso());
	}

}
