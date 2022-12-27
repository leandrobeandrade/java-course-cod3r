package colecoes;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		double[] notas = new double[4];
		System.out.println(Arrays.toString(notas));
		
		notas[0] = 7.9;
		notas[1] = 8;
		notas[2] = 6.7;
		notas[3] = 9.7;
		
		// Outra forma de preencher o Array
//		double[] notas = {7.9, 8, 6.7, 9.7};
		
		System.out.println(Arrays.toString(notas));
		
		double total = 0;
		for (int i = 0; i < notas.length; i++) {
			total += notas[i];
		}
		
		System.out.println(total / notas .length);
	}

}
