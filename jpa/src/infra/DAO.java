package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<T> {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<T> classe;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("jpa");
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
		}
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO(Class<T> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO<T> abrirTrans() {
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<T> fecharTrans() {
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<T> incluir(T entidade) {
		em.persist(entidade);
		return this;
	}
	
	public DAO<T> incluirAtomico(T entidade) {
		return this.abrirTrans().incluir(entidade).fecharTrans();
	}
	
	public T obterPorId(Object id) {
		return em.find(classe, id);
	}
	
	public List<T> obterTodos() {
		return this.obterTodos(10, 0);
	}
	
	public List<T> obterTodos(int qtd, int deslocamento) {
		if (classe == null) {
			throw new UnsupportedOperationException("Classe nula.");
		}
		
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<T> query = em.createQuery(jpql, classe);
		query.setMaxResults(qtd);
		query.setFirstResult(deslocamento);
		
		return query.getResultList();
	}
	
	public List<T> consultar(String nomeConsulta, Object... params) {
		TypedQuery<T> query = em.createNamedQuery(nomeConsulta, classe);
		
		for (int i = 0; i < params.length; i += 2) {
			query.setParameter(params[i].toString(), params[i + 1]);
		}
		
		return query.getResultList();
	}
	
	public T consultarUm(String nomeConsulta, Object... params) {
		List<T> lista = consultar(nomeConsulta, params);
		
		return lista.isEmpty() ? null : lista.get(0);
	}
	
	public void fechar() {
		em.close();
	}
	
}
