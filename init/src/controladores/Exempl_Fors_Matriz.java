package controladores;

import java.util.Arrays;
import java.util.Scanner;

public class Exempl_Fors_Matriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Notas de quantos alunos? ");
		int qtdAlunos = scan.nextInt();

		System.out.print("Quantas notas por aluno? ");
		int qtdNotas = scan.nextInt();

		double[][] notasTurma = new double[qtdAlunos][qtdNotas];
		double total = 0;

		for (int alu = 0; alu < notasTurma.length; alu++) {
			for (int not = 0; not < notasTurma[alu].length; not++) {
				System.out.printf("Informe a nota %d do aluno %d ", not + 1, alu + 1);
				notasTurma[alu][not] = scan.nextDouble();
				total += notasTurma[alu][not];
			}
		}

		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("\nA média da turma é " + media);

		for (double[] notas : notasTurma) {
			System.out.println(Arrays.toString(notas));
		}

		scan.close();
	}

}
