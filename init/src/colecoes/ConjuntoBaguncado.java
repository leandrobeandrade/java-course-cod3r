package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		Set set = new HashSet();
		
		conjunto.add(1.2);		// double -> Double
		conjunto.add(true);		// boolean -> Boolean
		conjunto.add("Teste");	// String
		conjunto.add(1);		// int -> Integer
		conjunto.add('x');		// char -> Character
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println("Removeu: " + conjunto.remove("teste"));
		System.out.println("Removeu: " + conjunto.remove("Teste"));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println("Contém? " + conjunto.contains('x'));
		System.out.println("Contém? " + conjunto.contains("Teste"));
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set);
		System.out.println(conjunto);
		
		// UNIÃO
//		conjunto.addAll(set);
//			System.out.println("UNIÃO" + conjunto);
		
		// INTERSEÇÃO
		conjunto.retainAll(set);
		System.out.println("INTERSEÇÃO" + conjunto); // Valores em comun
	}

}
