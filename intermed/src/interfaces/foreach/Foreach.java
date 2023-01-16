package interfaces.foreach;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Fulano", "Beltrano", "Ciclano");
		
		System.out.println("Forma tradicional...");
		
		for (String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #1...");
		aprovados.forEach(nome -> System.out.println(nome));
		
		System.out.println("\nMethod reference #1...");
		aprovados.forEach(System.out::println);

		System.out.println("\nLambda #2...");
		aprovados.forEach(nome -> imprimir(nome));
		
		System.out.println("\nMethod reference #2...");
		aprovados.forEach(Foreach::imprimir);
	}
	
	static void imprimir(String nome) {
		System.out.println("Nome: " + nome);
	}

}
