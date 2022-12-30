package controladores;

import java.util.Scanner;

public class Exerc_Ano_Bissexto {
	/** 2. Criar um programa que informa se o ano atual é um ano bissexto; */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o ano: ");
		int ano = scanner.nextInt();

		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0);

		if (bissexto == true) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		scanner.close();
	}
}
