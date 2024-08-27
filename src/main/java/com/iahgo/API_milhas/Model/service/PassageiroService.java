package com.iahgo.API_milhas.Model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iahgo.API_milhas.Model.domain.Passageiro;
import com.iahgo.API_milhas.Model.repository.PassageiroRepository;

@Service
public class PassageiroService {

    @Autowired
    private PassageiroRepository passageiroRepository;

    public Passageiro salvar(Passageiro passageiro) {
        return passageiroRepository.save(passageiro);
    }

    public List<Passageiro> findAll() {
        return (List<Passageiro>) passageiroRepository.findAll();
    }

    public Passageiro findById(Integer id) {
        Optional<Passageiro> passageiro = passageiroRepository.findById(id);
        return passageiro.orElse(null);
    }

    public Passageiro atualizar(Passageiro passageiro) {
        return passageiroRepository.save(passageiro);
    }

    public void delete(Integer id) {
        passageiroRepository.deleteById(id);
    }
}
