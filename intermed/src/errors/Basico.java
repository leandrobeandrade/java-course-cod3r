package errors;

import streams.filter.Aluno;

public class Basico {

	public static void main(String[] args) {
//		System.out.println(7 / 0);
		/*
		 * Aluno aluno = null; imprimeAluno(aluno);
		 */
		
		try {
			imprimeAluno(null);
		} catch (Exception e) {
			System.out.println("ERROR!!!");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
	
	public static String imprimeAluno(Aluno aluno) {
		return aluno.toString();
	}

}
