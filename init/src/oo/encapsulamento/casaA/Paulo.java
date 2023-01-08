package oo.encapsulamento.casaA;

public class Paulo {
	
	void testeAcessos() {
		Ana esposa = new Ana();
		
//		System.out.println(esposa.segredo);	// Não disponível - privado
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.FormaDeFalar);
		System.out.println(esposa.todosSabem);
	}
}
