package supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		Supplier<List<String>> lista = () -> Arrays.asList("Fulano", "Beltrano", "Ciclano", "Belciclano");
		System.out.println(lista.get());
	}

}
