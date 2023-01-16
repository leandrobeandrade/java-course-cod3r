package lambdas.binario;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.consumer.Produto;

public class Desafio {

	public static void main(String[] args) {
		/**
		 * Calcular o preço real do produto com desconto
		 * Imposto Municipal: >= 2500 (8,5%)/ 2500 (isento)
		 * Frete: >= 3000 (100)/ < 3000 (50)
		 * Arredondar: Deixar duas casas decimais
		 * Formatar: R$1234,56
		 */
		
		Produto p = new Produto("IPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoFinal = prod -> prod.preco * (1 - prod.desconto);
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", preco));
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
		
		String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);
		System.out.println("Preço final: " + preco);
	}

}
