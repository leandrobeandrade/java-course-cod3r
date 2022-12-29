package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Fulano");
		fila.offer("Beltrano");
		fila.add("Ciclano");
		fila.offer("Belciclano");
		
//		fila.contains("...");
//		fila.size();
//		fila.isEmpty();
//		fila.clear();
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		System.out.println();
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());	// retorna null em fila vazia
		System.out.println(fila.remove());  // retorna exception em fila vazia
	}

}
