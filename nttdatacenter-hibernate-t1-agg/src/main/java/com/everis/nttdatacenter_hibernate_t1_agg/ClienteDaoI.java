package com.everis.nttdatacenter_hibernate_t1_agg;

import java.util.List;

public interface ClienteDaoI{
	
	public List<Cliente> searchClients();

	public Cliente searchByNameClient(String name);
	
}
