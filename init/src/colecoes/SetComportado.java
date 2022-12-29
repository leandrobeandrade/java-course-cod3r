package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComportado {

	public static void main(String[] args) {
		Set<String> listaDes = new HashSet<>();
		Set<String> listaOrd = new TreeSet<>();
		
		listaDes.add("Fulano");
		listaDes.add("Ciclano");
		listaDes.add("Beltrano");
		listaDes.add("Belciclano");
		
		listaOrd.add("Fulano");
		listaOrd.add("Ciclano");
		listaOrd.add("Beltrano");
		listaOrd.add("Belciclano");
		
		System.out.println("Lista desordenada" + listaDes);
		System.out.println("Lista ordenada" + listaOrd);
	}

}
