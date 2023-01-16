package streams.init;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		/**
		 * A partir da lista a seguir:
		 * 1. Converter o número para string binária / 6 => "110"
		 * 2. Inverter s string / "110" => "011"
		 * 3. Converter de string para número novamente / 3
		 */
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);
		
//		nums.stream().map(n -> Integer.toBinaryString(n)).forEach(print);	// Sem reference methods
		nums.stream().map(Integer::toBinaryString).map(inverter).map(binarioParaInt).forEach(System.out::println);
	}

}
