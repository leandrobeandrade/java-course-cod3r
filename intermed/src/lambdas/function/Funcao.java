package lambdas.function;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		Function<Integer, String> parImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
		System.out.println(parImpar.apply(34));
		
		Function<String, String> resultado = valor ->  "Resultado: " + valor;
		Function<String, String> empolgado = valor -> valor + "!!!";
		String resultadoFinal = parImpar.andThen(resultado).andThen(empolgado).apply(32);
		System.out.println(resultadoFinal);
	}

}
