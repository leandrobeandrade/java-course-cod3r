package streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Fulano", 7.8);
		Aluno a2 = new Aluno("Beltrano", 5.8);
		Aluno a3 = new Aluno("Ciclano", 9.8);
		Aluno a4 = new Aluno("Belciclano", 6.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovados = al -> al.nota >= 7;
		Function<Aluno, String> saudacao = al -> "Parabéns " + al.nome;
		
		alunos.stream().filter(aprovados).map(saudacao).forEach(System.out::println);
	}

}
