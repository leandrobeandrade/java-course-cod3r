package streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduzindo2 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Fulano", 7.1);
		Aluno a2 = new Aluno("Beltrano", 6.1);
		Aluno a3 = new Aluno("Ciclano", 8.1);
		Aluno a4 = new Aluno("Belciclano", 10.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNota = a -> a.nota; // (Function)Pega o tipo aluno e retorna tipo double
		BinaryOperator<Double> somatoria = (a, b) -> a + b;
		
		alunos.parallelStream().filter(aprovado).map(apenasNota).reduce(somatoria).ifPresent(System.out::println);;
	}

}

class Aluno {
	public final String nome;
	public final Double nota;
	
	public Aluno(String nome, Double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}
	
}
