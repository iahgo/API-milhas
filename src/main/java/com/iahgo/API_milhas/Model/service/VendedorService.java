package com.iahgo.API_milhas.Model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iahgo.API_milhas.Model.domain.Vendedor;
import com.iahgo.API_milhas.Model.repository.VendedorRepository;

@Service
public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    public Vendedor salvar(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    public List<Vendedor> findAll() {
        return (List<Vendedor>) vendedorRepository.findAll();
    }

    public Vendedor findById(Integer id) {
        Optional<Vendedor> vendedor = vendedorRepository.findById(id);
        return vendedor.orElse(null);
    }

    public Vendedor atualizar(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    public void delete(Integer id) {
        vendedorRepository.deleteById(id);
    }
}
