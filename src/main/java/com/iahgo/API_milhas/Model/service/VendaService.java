package com.iahgo.API_milhas.Model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iahgo.API_milhas.Model.domain.Venda;
import com.iahgo.API_milhas.Model.repository.VendaRepository;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public Venda salvar(Venda venda) {
        return vendaRepository.save(venda);
    }

    public List<Venda> findAll() {
        return (List<Venda>) vendaRepository.findAll();
    }

    public Venda findById(Integer id) {
        Optional<Venda> venda = vendaRepository.findById(id);
        return venda.orElse(null);
    }

    public Venda atualizar(Venda venda) {
        return vendaRepository.save(venda);
    }

    public void delete(Integer id) {
        vendaRepository.deleteById(id);
    }
}
