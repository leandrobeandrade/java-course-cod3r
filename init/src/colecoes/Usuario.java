package colecoes;

public class Usuario {
	String nome;
	String email;
	
	public boolean iguais(Object obj) {
		Usuario outro = (Usuario) obj;
		
		boolean nomeIgual = outro.nome == this.nome;
		boolean emailIgual = outro.email == this.email;
		
		return nomeIgual && emailIgual;
	}
	
	public boolean equals(Object obj) {
		Usuario outro = (Usuario) obj;
		
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual;
	}
	
	public boolean instance(Object obj) {
		if (obj instanceof Usuario) {
			Usuario outro = (Usuario) obj;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}
	
}
