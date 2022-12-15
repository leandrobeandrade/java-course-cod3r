package init;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean val1 = true;
		boolean val2 = 3 > 7;

		System.out.println(val1 && !val2); // compara true com true
		System.out.println(val1 && !!val2); // compara true com false
		System.out.println(val1 || val2); // compara true ou false
		System.out.println(!val1); // nega true
		System.out.println(!!val1); // nega 2 vezes true

		// TABELA VERDADE E
		System.out.println("\nTABELA VERDADE AND");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);	// já dá warning
//		System.out.println(false && false);	// já dá warning

		// TABELA VERDADE E
		System.out.println("\nTABELA VERDADE OR");
//		System.out.println(true || true);	// já dá warning
//		System.out.println(true || false);	// já dá warning
		System.out.println(false || true);
		System.out.println(false || false);

		// TABELA VERDADE E
		System.out.println("\nTABELA VERDADE XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
	}
}
