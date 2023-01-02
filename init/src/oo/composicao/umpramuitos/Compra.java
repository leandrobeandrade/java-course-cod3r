package oo.composicao.umpramuitos;

import java.util.ArrayList;

public class Compra {
	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	// Compra possui vários itens
	void adicionarItem(Item item) {
		itens.add(item);
	}
	
	void adicionarItem(String nome, int qtd, double preco) {
		this.adicionarItem(new Item(nome , qtd, preco));
	}
	
	double getValorTotal() {
		double total = 0;
		
		for (Item item: itens) {
			total += item.qtd * item.preco;
		}
		
		return total;
	}
}
