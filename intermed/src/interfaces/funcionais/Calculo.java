package interfaces.funcionais;

//@FunctionalInterface
public interface Calculo {
	double calcular(double a, double b);
	
	// Declarar mais métodos dentro de uma interface funcional
	default String legal () {
		return "Legal";
	}
	
	// Utilizado a partir da Interface, sem instâncias
	static String muitoLegal() {
		return "Muito legal";
	}
}
