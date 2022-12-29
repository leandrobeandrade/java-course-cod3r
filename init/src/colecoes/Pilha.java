package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> pilha = new ArrayDeque<>();
		
		pilha.add("Fulano");
		pilha.add("Ciclano");
		pilha.add("Beltrano");
		pilha.add("Belciclano");
		
//		System.out.println(pilha.peek());
//		System.out.println(pilha.element());
		
//		System.out.println(pilha.poll());
//		System.out.println(pilha.poll());
//		System.out.println(pilha.poll());
//		System.out.println(pilha.poll());
//		System.out.println(pilha.poll());
//		
		for (String pil: pilha) {
			System.out.println(pil);
		}
		
//		System.out.println(pilha.remove());
//		System.out.println(pilha.pop());
	}

}
