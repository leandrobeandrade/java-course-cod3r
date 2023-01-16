package streams.match;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {
		OutrosAlunos a1 = new OutrosAlunos("Fulano", 7.1);
		OutrosAlunos a2 = new OutrosAlunos("Beltrano", 6.1);
		OutrosAlunos a3 = new OutrosAlunos("Ciclano", 8.1);
		OutrosAlunos a4 = new OutrosAlunos("Belciclano", 10.0);
		
		List<OutrosAlunos> alunos = Arrays.asList(a1, a2, a3, a4);
		Comparator<OutrosAlunos> melhorNota = (aluno1, aluno2) -> {
			if (aluno1.nota > aluno2.nota) return 1;
			if (aluno1.nota < aluno2.nota) return -1;
		
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
	}

}

class OutrosAlunos {
	public final String nome;
	public final Double nota;
	
	public OutrosAlunos(String nome, Double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " tem a nota: " + nota;
	}
	
}