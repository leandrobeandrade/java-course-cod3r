package init;

import javax.swing.JOptionPane;

public class ConvTipoPrimitivo {

	public static void main(String[] args) {
		// CASTING
		double d = 10.15;
		System.out.println(d);
		
		float f = (float) d;
		System.out.println(f);
		
		int in = 10;
		byte b = (byte) in;
		System.out.println(b);
		
		// CONVERSÃO NÚMERO PARA STRING
		Integer int1 = 10;
		System.out.println(int1.toString().length());
		
		int int2 = 20;
		System.out.println(Integer.toString(int2));
		
		System.out.println("" + int2);  // Não recomendado
		
		// CONVERSÃO STRING PARA NÚMERO
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		System.out.println("Valor1: " + valor1 + " Valor2: " + valor2);
		
		Double numero1 = Double.parseDouble(valor1);
		Double numero2 = Double.parseDouble(valor2);
		Double soma = numero1 + numero2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + soma / 2);
		
	}

}
