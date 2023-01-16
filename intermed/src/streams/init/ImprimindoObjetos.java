package streams.init;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Fulano", "Beltrano", "Ciclano");
		
		System.out.println("Utilizando FOREACH");
		for (String nome: aprovados) {
			System.out.println("Nome: " + nome);	
		}
		
		System.out.println("\nUtilizando ITERATOR");
		Iterator<String> it = aprovados.iterator();
		
		while(it.hasNext()) {
			System.out.println("Nome: " + it.next());
		}
		
		System.out.println("\nUtilizando STREAM");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}

}
