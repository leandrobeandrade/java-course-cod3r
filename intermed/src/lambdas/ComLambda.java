package lambdas;

public class ComLambda {

	public static void main(String[] args) {
		Calculo calc = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calc.calcular(2, 2));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.calcular(2, 2));
	}

}
