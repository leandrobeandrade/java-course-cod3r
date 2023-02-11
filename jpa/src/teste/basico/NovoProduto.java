package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		Produto produto = new Produto("monitor 23", 789.98);
		DAO<Produto> dao = new DAO<>();
		
		// Os 2 métodos funcionam
//		dao.abrirTrans().incluir(produto).fecharTrans().fechar();
		dao.incluirAtomico(produto).fechar();
		
		System.out.println("ID do produto: " + produto.getId());
	}

}
