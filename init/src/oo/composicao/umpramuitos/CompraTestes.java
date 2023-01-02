package oo.composicao.umpramuitos;

public class CompraTestes {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "Fulano";
		compra1.adicionarItem(new Item("Caneta", 20, 7.45));
		compra1.adicionarItem(new Item("Borracha", 2, 6.22));
		compra1.adicionarItem(new Item("Caderno", 3, 12.66));
		
		System.out.println(compra1.itens.size());
		System.out.printf("%.2f", compra1.getValorTotal());
	}

}
