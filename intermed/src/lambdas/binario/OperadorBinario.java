package lambdas.binario;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println("Média " + media.apply(9.8, 5.7));
		
		BiFunction<Double, Double, String> resultado = (n1 , n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		System.out.println(resultado.apply(5.2, 9.0));
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(media.andThen(conceito).apply(9.7, 4.1));
	}

}
