package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
//		System.out.println(segredo);	// Não disponível - privado
//		System.out.println(facoDentroDeCasa);	// Não disponível fora do mesmo pacote - default
		System.out.println(FormaDeFalar);
		System.out.println(todosSabem);
	}
}
