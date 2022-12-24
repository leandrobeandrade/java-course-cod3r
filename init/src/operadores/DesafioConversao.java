package operadores;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		String val1 = scan.next().replace(",", ".");
		System.out.println("Informe o segundo valor: ");
		String val2 = scan.next().replace(",", ".");
		System.out.println("Informe o terceiro valor: ");
		String val3 = scan.next().replace(",", ".");
	
		double salario1 = Double.parseDouble(val1);
		double salario2 = Double.parseDouble(val2);
		double salario3 = Double.parseDouble(val3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A média dos salários é:" + media);
		
		scan.close();
	}

}
