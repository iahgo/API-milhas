package com.iahgo.API_milhas.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.iahgo.API_milhas.Model.domain.Cliente;
import com.iahgo.API_milhas.Model.service.ClienteService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/api/v1/clientes")
@Tag(name = "Cliente", description = "Endpoints para gerenciar clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Operation(summary = "Salvar Cliente")
    @PostMapping(value = "/salvar")
    public Cliente salvarCliente(@RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
    }

    @Operation(summary = "Listar todos Clientes")
    @GetMapping(value = "/listarTodos")
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @Operation(summary = "Pesquisar Cliente por ID")
    @GetMapping("/pesquisar/{id}")
    public Cliente findById(@PathVariable("id") Integer id) {
        return clienteService.findById(id);
    }

    @Operation(summary = "Atualizar Cliente")
    @PutMapping(value = "/atualizar")
    public Cliente atualizarCliente(@RequestBody Cliente cliente) {
        return clienteService.atualizar(cliente);
    }

    @Operation(summary = "Deletar Cliente")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        clienteService.delete(id);
        return ResponseEntity.ok().build();
    }
}
