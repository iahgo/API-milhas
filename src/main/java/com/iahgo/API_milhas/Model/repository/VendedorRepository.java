package com.iahgo.API_milhas.Model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iahgo.API_milhas.Model.domain.Vendedor;

@Repository
public interface VendedorRepository extends CrudRepository<Vendedor, Integer> {
		Vendedor findByCpf(String cpf);

	Collection<Vendedor> findAll(Sort orderBy);
}