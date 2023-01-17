package errors;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
//		geraErro1();	// Não tratados
//		geraErro2();	// Não tratados
		
		// Tratado
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim!");
	}
	
	// Exceção NÃO checada ou NÃO verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #1");
	}
	
	// Exceção chacada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro #2");
	}

}
