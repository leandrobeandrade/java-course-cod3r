package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	void testeAcessos() {
		Ana sogra = new Ana();
		
//		System.out.println(sogra.segredo);	// Não disponível - privado
//		System.out.println(sogra.facoDentroDeCasa);	// Não disponível fora do mesmo pacote - default
//		System.out.println(sogra.FormaDeFalar);
		System.out.println(sogra.todosSabem);
	}
}
