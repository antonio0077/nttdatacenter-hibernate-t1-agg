package com.everis.nttdatacenter_hibernate_t1_agg;

import java.util.List;

import org.hibernate.Session;

public class ContratoServiceImpl implements ContratoServiceI{
	
	private Session session;
	private ContratoDaoI contractDao;
	
	public ContratoServiceImpl(Session session) {
		this.session = session;
	}

	@Override
	public void insertContract(Contrato contract) {		
		contractDao.insert(contract);		
	}

	@Override
	public Contrato searchById(Long id) {		
		Contrato result = contractDao.searchById(id);
		return result;		
	}


	@Override
	public List<Contrato> searchAll() {
		
		List<Contrato> result = contractDao.searchAll();
		return result;
		
	}

	@Override
	public void updateContract(Contrato contract) {
		contractDao.update(contract);		
	}

	@Override
	public void deleteContract(Contrato contract) {		
		contractDao.delete(contract);		
	}

	@Override
	public List<Contrato> searchByCustomer(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
