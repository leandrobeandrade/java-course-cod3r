package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		Produto produto = new Produto("notebook", 2987.78);
		DAO<Produto> dao = new DAO<>();
		
		// Os 2 métodos funcionam
//		dao.abrirTrans().incluir(produto).fecharTrans().fechar();
		dao.incluirAtomico(produto);
	}

}
