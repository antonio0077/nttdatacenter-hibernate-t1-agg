package com.everis.nttdatacenter_hibernate_t1_agg;

import java.util.List;

import org.hibernate.Session;

public class ClienteServiceImpl implements ClienteServiceI {

	
	private Session session;

	public ClienteServiceImpl(Session session) {
		this.session = session;
	}

	@Override
	public void insertCustomer(Cliente cliente) {
		// TODO Auto-generated method stub	
	}

	@Override
	public List<Cliente> searchAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente searchById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> searchByFullName(String name, String lastname1, String lastname2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomer(Cliente customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(Cliente customer) {
		// TODO Auto-generated method stub
		
	}
	


}
