package generics.init;

import java.util.Arrays;
import java.util.List;

public class Caixa {

	public static void main(String[] args) {

		// SEM GENERICS
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // double

//		Integer coisa = (Integer) caixaA.abrir(); // Erro de casting int para double
		Double coisa = (Double) caixaA.abrir(); // OK

		System.out.println(coisa);

		// COM GENERICS
		CaixaGenerica<Integer> caixaB = new CaixaGenerica<>();
		caixaB.guardar(10);

		System.out.println(caixaB.abrir());

		CaixaGenerica<String> caixaC = new CaixaGenerica<>();
		caixaC.guardar("Texto");

		System.out.println(caixaC.abrir());

		// CLASSES GENERICS HERDADAS (TIPO DEFINIDO NA INSTANCIAÇÃO)
		CaixaIntGenericsNaInstanc<String> caixaD = new CaixaIntGenericsNaInstanc<>();
		caixaD.guardar("Outro texto");

		System.out.println(caixaD.abrir());

		// CLASSES GENERICS HERDADAS (TIPO DEFINIDO NA CLASSE)
//		CaixaIntGenericsSemInstanc<String> caixaE = new CaixaIntGenericsSemInstanc<>(); // ERRO de tipo
		CaixaIntGenericsSemInstanc caixaE = new CaixaIntGenericsSemInstanc();
		caixaE.guardar(100);

		System.out.println(caixaE.abrir());
		
		// CLASSES GENERICS HERDADAS (COM RESTRIÇÃO DE TIPO)
		CaixaNumeroGenericsComRestricao<Number> caixaF = new CaixaNumeroGenericsComRestricao<>();
		caixaF.guardar(33);
		
		CaixaNumeroGenericsComRestricao<Number> caixaG = new CaixaNumeroGenericsComRestricao<>();
		caixaG.guardar(10.25);

		System.out.println(caixaF.abrir());
		System.out.println(caixaG.abrir());
		
		// MÉTODOS GENERICOS
		List<String> langs = Arrays.asList("JavaScript", "PHP", "Java", "Python");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		
		// (MODO RUIM COM CASTING)
		String ultimaLang1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLang1);
		
		Integer ultimoNum1 = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNum1);
		
		// (MODO BOM)
		String ultimaLang2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLang2);
		
		Integer ultimoNum2 = ListaUtil.getUltimo2(nums);
		System.out.println(ultimoNum2);
	}
}
