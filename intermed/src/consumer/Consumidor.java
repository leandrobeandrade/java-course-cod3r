package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + " " + p.preco);
		
		Produto prod1 = new Produto("Caneta", 12.34, 0.09);
		imprimir.accept(prod1);
		
		Produto prod2 = new Produto("Borracha", 1.34, 0.09);
		Produto prod3 = new Produto("Caderno", 12.34, 0.09);
		Produto prod4 = new Produto("Lápis", 12.34, 0.09);
		Produto prod5 = new Produto("Estojo", 12.34, 0.09);
		
		System.out.println();
		
		List<Produto> produtos = Arrays.asList(prod1, prod2, prod3, prod4, prod5);
		produtos.forEach(imprimir);
		
		System.out.println();
		
		produtos.forEach(p -> System.out.println(p.nome + " " + p.preco));
	}

}
