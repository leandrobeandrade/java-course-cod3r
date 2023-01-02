package oo.composicao.muitospramuitos;

public class CursoAlunoTestes {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Fulano");
		Aluno aluno2 = new Aluno("Ciclano");
		Aluno aluno3 = new Aluno("Beltrano");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Angular");
		Curso curso3 = new Curso("AWS");
		
		curso1.adicionarAlunos(aluno1);
		curso1.adicionarAlunos(aluno2);
		curso2.adicionarAlunos(aluno1);
		curso2.adicionarAlunos(aluno3);
		
		aluno1.adicionarCursos(curso3);
		aluno2.adicionarCursos(curso3);
		aluno3.adicionarCursos(curso3);
		
		for (Aluno aluno: curso1.alunos) {
			System.out.println("Matrículado no curso 1:");
			System.out.println("Nome: " + aluno.nome);
			System.out.println();
		}
		
		System.out.println("Alunos: " + aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");
		
		if (cursoEncontrado != null) {
			System.out.println("\nCurso encontrado: " + cursoEncontrado.nome);
			System.out.println("Alunos do curso encontrado: " + cursoEncontrado.alunos);
		}
	}

}
