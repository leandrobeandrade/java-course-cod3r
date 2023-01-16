package streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduzindo {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		Integer total1 = nums.stream().reduce(soma).get();
		System.out.println("Resulatdo normal: " + total1);
		
		// Atribui 100 a todos os valores
		Integer total2 = nums.parallelStream().reduce(100, soma);
		System.out.println("Resultado somando 100 em cada valor: " + total2);

		// Atribui 100 apenas no primeiro valor
		Integer total3 = nums.stream().reduce(100, soma);
		System.out.println("Resultado somando 100 no primeiro valor: " + total3);
		
		// Resultado é um Optional<Integer> e executa o reduce a partir de valores maiores que 5
		System.out.print("Resultado somando valores maiores que 5: ");
		nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);
	}

}
