package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Fulano");
		
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		compra1.adicionarItem("Caneta", 1.75, 3);
		compra1.adicionarItem(new Produto("Borracha", 2.84) , 2);
		
		compra2.adicionarItem("Caderno", 6.26, 4);
		compra2.adicionarItem(new Produto("Estojo", 9.11) , 1);
		
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println("Valor total: " + cliente.obterValorTotal());
	}

}
