package com.iahgo.API_milhas.Model.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iahgo.API_milhas.Model.domain.Cliente;
import com.iahgo.API_milhas.Model.domain.Passageiro;
import com.iahgo.API_milhas.Model.domain.Venda;
import com.iahgo.API_milhas.Model.domain.Vendedor;
import com.iahgo.API_milhas.Model.repository.ClienteRepository;
import com.iahgo.API_milhas.Model.repository.PassageiroRepository;
import com.iahgo.API_milhas.Model.repository.VendaRepository;
import com.iahgo.API_milhas.Model.repository.VendedorRepository;

@Service
public class DataLoaderService {

    @Autowired
    private VendedorRepository vendedorRepository;

    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PassageiroRepository passageiroRepository;

    public void loadDataFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                switch (data[0]) {
                    case "Vendedor":
                        Vendedor vendedor = new Vendedor();
                        vendedor.setNome(data[1]);
                        vendedor.setCpf(data[2]);
                        vendedor.setEmail(data[3]);
                        vendedorRepository.save(vendedor);
                        break;
                    case "Venda":
                        Venda venda = new Venda();
                        venda.setDescricao(data[1]);
                        venda.setValor(new BigDecimal(data[2]));
                        venda.setVendedor(vendedorRepository.findById(Integer.parseInt(data[3])).orElse(null));
                        vendaRepository.save(venda);
                        break;
                    case "Cliente":
                        Cliente cliente = new Cliente();
                        cliente.setNome(data[1]);
                        cliente.setCpf(data[2]);
                        cliente.setEmail(data[3]);
                        clienteRepository.save(cliente);
                        break;
                    case "Passageiro":
                        Passageiro passageiro = new Passageiro();
                        passageiro.setNome(data[1]);
                        passageiro.setCpf(data[2]);
                        passageiro.setCliente(clienteRepository.findById(Integer.parseInt(data[3])).orElse(null));
                        passageiroRepository.save(passageiro);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
