package ec.edu.ups.ppw64.demo64.dao;

import java.util.List;

import ec.edu.ups.ppw64.demo64.model.MensajesUsuarios;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class MensajeUsuarioDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void insert(MensajesUsuarios MensajesUsuarios) {
		em.persist(MensajesUsuarios);
	}
	
	public void update(MensajesUsuarios MensajesUsuarios) {
		em.merge(MensajesUsuarios);
	}
	
	public void remove(int codigo) {
		MensajesUsuarios MensajesUsuarios = em.find(MensajesUsuarios.class, codigo);
		em.remove(MensajesUsuarios);
	}
	
	public MensajesUsuarios read(int codigo) {
		MensajesUsuarios MensajesUsuarios = em.find(MensajesUsuarios.class, codigo);
		return MensajesUsuarios;
	}
	
	public List<MensajesUsuarios> getAll(){
		String jpql = "SELECT c FROM MensajesUsuarios c";
		Query q = em.createQuery(jpql, MensajesUsuarios.class);
		return q.getResultList();
	}
}
