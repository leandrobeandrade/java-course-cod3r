package lambdas.predicate;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		Predicate<Produto> caro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 3800.00, 0.85);
		System.out.println(caro.test(produto));
		
		// Predicado Composto
		Predicate<Integer> par = num -> num % 2 == 0;
		Predicate<Integer> tresDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println();
		System.out.println(par.and(tresDigitos).test(124));
		System.out.println(par.and(tresDigitos).test(123));
		System.out.println(par.and(tresDigitos).test(12));
		System.out.println(par.and(tresDigitos).test(1000));
		
		System.out.println();
		System.out.println(par.and(tresDigitos).negate().test(124));
		System.out.println(par.and(tresDigitos).negate().test(123));
		System.out.println(par.and(tresDigitos).negate().test(12));
		System.out.println(par.and(tresDigitos).negate().test(1000));
		
		System.out.println();
		System.out.println(par.or(tresDigitos).test(124));
		System.out.println(par.or(tresDigitos).test(123));
		System.out.println(par.or(tresDigitos).test(12));
		System.out.println(par.or(tresDigitos).test(1000));
	}

}
