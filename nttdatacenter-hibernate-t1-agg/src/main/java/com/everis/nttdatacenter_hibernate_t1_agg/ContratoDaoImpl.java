package com.everis.nttdatacenter_hibernate_t1_agg;

import java.util.List;

import org.hibernate.Session;


public class ContratoDaoImpl<T> implements ContratoDaoI{

	private Session session;
	private Class<T> entityClass;
	
	public ContratoDaoImpl(Session session) {
		this.session = session;
	}

	@Override
	public void insert(Object paramT) {
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		session.save(paramT);
		session.getTransaction().commit();
	}

	@Override
	public void update(Object paramT) {
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		session.saveOrUpdate(paramT);
		session.getTransaction().commit();
	}

	@Override
	public void delete(Object paramT) {
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		session.delete(paramT);
		session.getTransaction().commit();
	}

	@Override
	public Contrato searchById(Long id) {
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		Contrato result = (Contrato) session.get(this.entityClass, id);
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> searchAll() {

		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		List<T> result = session.createQuery("FROM " + this.entityClass.getName()).list();
		return result;

	}
	
	
	

}
