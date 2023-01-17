package streams.outros;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class OutrosMetodos {

	public static void main(String[] args) {
		Alunos_ a1 = new Alunos_("Fulano", 7.1);
		Alunos_ a2 = new Alunos_("Beltrano", 6.1);
		Alunos_ a3 = new Alunos_("Ciclano", 8.1);
		Alunos_ a4 = new Alunos_("Belciclano", 10.0);
		Alunos_ a5 = new Alunos_("Fulano", 7.1);
		Alunos_ a6 = new Alunos_("Beltrano", 6.1);
		Alunos_ a7 = new Alunos_("Ciclano", 8.1);
		Alunos_ a8 = new Alunos_("Belciclano", 10.0);
		
		List<Alunos_> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Utilizando distinct: ");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nUtilizando skip: ");
		alunos.stream().skip(4).forEach(System.out::println);
		
		System.out.println("\nUtilizando skip limitado: ");
		alunos.stream().skip(4).limit(2).forEach(System.out::println);
		
		System.out.println("\nUtilizando takeWhile: ");
		alunos.stream().takeWhile(a -> a.nota >= 7).forEach(System.out::println);
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

	@Override
	public String toString() {
		return nome + " tem a nota " + nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alunos_ other = (Alunos_) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(nota, other.nota);
	}
		
}