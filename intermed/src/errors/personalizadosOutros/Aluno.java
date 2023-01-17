package errors.personalizadosOutros;

import java.util.Objects;

public class Aluno {
	public final String nome;
	public final Double nota;
	
	public Aluno(String nome, Double nota) {
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
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(nota, other.nota);
	}
		
}
