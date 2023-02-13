package modelos.umpraum;

import infra.DAO;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		Assento assento = new Assento("16A");
		Cliente cliente = new Cliente("Fulano", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTrans().incluir(assento).incluir(cliente).fecharTrans().fechar();
	}

}
