package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Fulano"));
		usuarios.add(new Usuario("Ciclano"));
		usuarios.add(new Usuario("Beltrano"));
		usuarios.add(new Usuario("Belciclano"));
		
		boolean resultado = usuarios.contains(new Usuario("Belciclano"));
		System.out.println(resultado);
		
		
 	}

}
