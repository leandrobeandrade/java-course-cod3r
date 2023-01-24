package generics.estrutura;

public class Exec {

	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Fulano");
		resultadoConcurso.adicionar(2, "Beltrano");
		resultadoConcurso.adicionar(3, "Ciclano");
		resultadoConcurso.adicionar(4, "Belciclano");
		resultadoConcurso.adicionar(2, "Outro");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(2));
		
		ExemploComparable.log();
	}

}
