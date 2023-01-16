package streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduzindo4 {

	public static void main(String[] args) {
		Alunos a1 = new Alunos("Fulano", 7.1);
		Alunos a2 = new Alunos("Beltrano", 6.1);
		Alunos a3 = new Alunos("Ciclano", 8.1);
		Alunos a4 = new Alunos("Belciclano", 10.0);
		
		List<Alunos> alunos = Arrays.asList(a1, a2, a3, a4);
		Predicate<Alunos> aprovado = a -> a.nota >= 7;
		Function<Alunos, Double> apenasNota = a -> a.nota;
		BiFunction<Media, Double, Media> calcMedia = (media, nota) -> {
			media.adicionar(nota);
			return media;
		};
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);
		
		Media media = alunos.parallelStream()
				.filter(aprovado)
				.map(apenasNota)
				.reduce(new Media(), calcMedia, combinarMedia);
		
		System.out.println("Média: " + media.getVal());
	}

}

class Alunos {
	public final String nome;
	public final Double nota;
	
	public Alunos(String nome, Double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
}