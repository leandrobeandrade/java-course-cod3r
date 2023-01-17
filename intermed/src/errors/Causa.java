package errors;

public class Causa {

	public static void main(String[] args) {
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if (e.getCause()!= null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		metodoA(null);
	}

	static void metodoA(Teste teste) {
		try {
			metodoB(teste);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}

	static void metodoB(Teste teste) {
		if (teste == null) {
			throw new NullPointerException("Aluno está nulo!");
		}
		
		System.out.println(teste.nome);
	}

}

class Teste {
	public String nome;
}
