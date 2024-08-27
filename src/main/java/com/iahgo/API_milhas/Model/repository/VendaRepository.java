package com.iahgo.API_milhas.Model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.iahgo.API_milhas.Model.domain.Venda;

@Repository
public interface VendaRepository extends CrudRepository<Venda, Integer> {
}
