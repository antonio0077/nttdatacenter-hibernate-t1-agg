package com.everis.nttdatacenter_hibernate_t1_agg;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

public class ClienteDaoImpl implements ClienteDaoI{

	private Session session;
	
	public ClienteDaoImpl(Session session) {
		this.session = session;
	}
	
	@Override
	public Cliente searchByNameClient(String name) {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> searchClients() {
	List<Cliente> res = new ArrayList<Cliente>();

	//Verificación de sesión abierta
	if(!session.getTransaction().isActive()) {
	session.getTransaction().begin();
	}

	//Localiza jugadores en función del nombre
	res = session.createQuery("FROM "+ Cliente.class).list();
	return res;
	}
	


}
