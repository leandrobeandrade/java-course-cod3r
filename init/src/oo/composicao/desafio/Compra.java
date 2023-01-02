package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> itens = new ArrayList<>();

	void adicionarItem(Produto p, int qtd) {
		this.itens.add(new Item(qtd, p));
	}
	
	void adicionarItem(String nome, double preco, int qtd) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(qtd, produto));
	}

	double obterValorTotal() {
		double total = 0;
		
		for (Item item: itens) {
			total += item.qtd * item.produto.preco;
		}
		
		return total;
	}
}
