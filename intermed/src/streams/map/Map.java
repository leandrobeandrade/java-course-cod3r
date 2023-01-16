package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> maiuscula1 = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra1 = n -> n.charAt(0) + "";
		UnaryOperator<String> grito1 = n -> n + "!!!";
		
		String resultado = maiuscula1.andThen(primeiraLetra1).andThen(grito1).apply("Bmw");
		System.out.println();
		System.out.println(resultado);
		
		System.out.println("\nUtilizando COMPOSIÇÃO");
		marcas.stream().map(maiuscula1).forEach(print);
		
		// Utilizando Utilitarios
		System.out.println();
		marcas.stream().map(Utilitarios.maiuscula).map(Utilitarios.primeiraLetra).forEach(print);
		
		System.out.println();
		marcas.stream().map(Utilitarios.maiuscula).map(primeiraLetra1).map(Utilitarios.grito()).forEach(print);
	}

}
