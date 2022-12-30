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
	
	// Outra forma (internet)
//	public static void main(String[] args){
//        Scanner ent = new Scanner(System.in);
//        int ano;
//        
//        System.out.println("Digite um ano para saber se é bissexto");
//        ano = ent.nextInt();
//        
//        // se o ano for maior que 400
//        if(ano % 400 == 0){
//            System.out.println(ano + " é bissexto.");
//        // se o ano for menor que 400
//        } else if((ano % 4 == 0) && (ano % 100 != 0)){
//            System.out.println(ano + " é bissexto.");
//        } else{
//            System.out.println(ano + " não é bissexto");
//        }
//    }
}
