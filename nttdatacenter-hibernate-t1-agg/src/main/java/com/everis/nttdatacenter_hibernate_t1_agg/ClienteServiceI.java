package com.everis.nttdatacenter_hibernate_t1_agg;

import java.util.List;

public interface ClienteServiceI {
	
	public void insertCustomer(Cliente cliente);

	public List<Cliente> searchAll();

	public Cliente searchById(Long id);

	public List<Cliente> searchByFullName(String name, String lastname1, String lastname2);

	public void updateCustomer(Cliente customer);

	public void deleteCustomer(Cliente customer);

}
