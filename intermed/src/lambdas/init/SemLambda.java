package lambdas.init;

public class SemLambda {

	public static void main(String[] args) {
		Calculo calc = new Somar();
		
		System.out.println(calc.calcular(2, 2));
		
		calc = new Multiplicar();
		System.out.println(calc.calcular(2, 2));
	}

}
