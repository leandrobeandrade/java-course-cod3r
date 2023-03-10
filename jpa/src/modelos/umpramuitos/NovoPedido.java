package modelos.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;

public class NovoPedido {

	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		
		Produto produto = new Produto("Geladeira", 2789.99);
		Pedido pedido = new Pedido();
		ItemPedido item = new ItemPedido(pedido, produto, 10);
		
		dao.abrirTrans().incluir(produto).incluir(pedido).incluir(item).fecharTrans().fechar();
	}

}
