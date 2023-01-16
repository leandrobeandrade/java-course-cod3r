package streams.match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		Alunos_ a1 = new Alunos_("Fulano", 7.1);
		Alunos_ a2 = new Alunos_("Beltrano", 6.1);
		Alunos_ a3 = new Alunos_("Ciclano", 8.1);
		Alunos_ a4 = new Alunos_("Belciclano", 10.0);
		
		List<Alunos_> alunos = Arrays.asList(a1, a2, a3, a4);
		Predicate<Alunos_> aprovado = a -> a.nota >= 7;
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(aprovado.negate()));
	}

}

class Alunos_ {
	public final String nome;
	public final Double nota;
	
	public Alunos_(String nome, Double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}
	
}