package campo_minado;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Teste {

	@org.junit.jupiter.api.Test
	void test() {
		int a = 1 + 1;
		
		assertEquals(2, a);
//		fail("Not yet implemented");
	}
	
	@org.junit.jupiter.api.Test
	void outroTest() {
		int x = 2 + 10 - 9;
		assertEquals(3, x);
	}

}
