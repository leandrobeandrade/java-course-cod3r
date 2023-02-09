package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = new Usuario("Teste", "tes@email.com");
		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
