package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 4L);
		usuario.setNome("ContraBelciclano");
		usuario.setEmail("con@email.com");
		
//		em.merge(usuario);
		em.getTransaction().commit();
				
		em.close();
		emf.close();
	}

}
