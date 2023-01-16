package streams.map;

import java.util.function.UnaryOperator;

public class Utilitarios {
	// Lambdas
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	
	// Função normal
	public final static UnaryOperator<String> grito() { 
		return n -> n + "!!!";
	}
}
