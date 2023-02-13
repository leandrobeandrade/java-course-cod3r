package modelos.heranca;

import infra.DAO;

public class NovoAluno {

	public static void main(String[] args) {
		DAO<Aluno> dao = new DAO<>();
		Aluno aluno1 = new Aluno(123L, "Fulano");
		
		AlunoBolsista aluno2 = new AlunoBolsista(345L, "Beltrano", 1000);
		
		dao.incluirAtomico(aluno1).incluirAtomico(aluno2);
		dao.fechar();
	}

}
