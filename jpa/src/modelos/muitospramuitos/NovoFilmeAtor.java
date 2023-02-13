package modelos.muitospramuitos;

import infra.DAO;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		Filme filmeA = new Filme("Star Wars Ep 4", 8.7);
		Filme filmeB = new Filme("O Fugitivo", 8.9);
		
		Ator atorA = new Ator("Harrison Ford");
		Ator atrizB = new Ator("Carrie Fisher");
		
		filmeA.adicionar(atorA);
		filmeA.adicionar(atrizB);
		
		filmeB.adicionar(atorA);
		
		DAO<Filme> dao = new DAO<>();
		dao.incluirAtomico(filmeA);
		
		dao.fechar();
	}

}
