package interfaces_funcionais;

import java.util.function.BinaryOperator;

public class Lambda {

	public static void main(String[] args) {
		Calculo calc = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calc.calcular(2, 2));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.calcular(2, 2));
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
		
		// Interfaces funcionais disponibilizadas pelo próprio Java
		BinaryOperator<Double> calc2 = (x, y) -> {
			return x + y;
		};
		System.out.println(calc2.apply(2.0, 2.0));
		
		BinaryOperator<Integer> calc3 = (x, y) -> {
			return x * y;
		};
		System.out.println(calc3.apply(2, 2));
	}

}
