package com.iahgo.API_milhas.Model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iahgo.API_milhas.Model.domain.Cliente;
import com.iahgo.API_milhas.Model.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAll() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    public Cliente findById(Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElse(null);
    }

    public Cliente atualizar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void delete(Integer id) {
        clienteRepository.deleteById(id);
    }
}
