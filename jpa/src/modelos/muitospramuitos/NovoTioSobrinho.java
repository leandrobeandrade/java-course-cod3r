package modelos.muitospramuitos;

import infra.DAO;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		Tio tio1 = new Tio("Fulano");
		Tio tio2 = new Tio("Beltrano");
		
		Sobrinho sobrinho1 = new Sobrinho("Ciclano");
		Sobrinho sobrinho2 = new Sobrinho("Belciclano");
		
		tio1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio1);
		
		tio1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio1);
	
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirTrans().incluir(tio1).incluir(tio2).incluir(sobrinho1).incluir(sobrinho2).fecharTrans().fechar();
	}

}
