package colecoes;

import java.util.Date;

public class Equal {

	public static void main(String[] args) {
		Usuario user1 = new Usuario();
		user1.nome = "Fulano";
		user1.email = "fulano@email.com";
		
		Usuario user2 = new Usuario();
		user2.nome = "Fulano";
		user2.email = "fulano@email.com";
		
		System.out.println(user1 == user2);
		System.out.println(user1.iguais(user2));
		System.out.println(user1.equals(user2));
		System.out.println(user1.instance(new Date()));	// Resolve o problema de exceção que daria
	}

}
