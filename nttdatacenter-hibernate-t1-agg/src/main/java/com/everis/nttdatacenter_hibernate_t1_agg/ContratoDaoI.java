package com.everis.nttdatacenter_hibernate_t1_agg;

import java.util.List;

public interface ContratoDaoI<T> {

public void insert(final T paramT);

public void update(final T paramT);

public void delete(final T paramT);

public Contrato searchById(final Long id);

public List<T> searchAll();



}
