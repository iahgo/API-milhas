package com.iahgo.API_milhas.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.iahgo.API_milhas.Model.domain.Venda;
import com.iahgo.API_milhas.Model.service.VendaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/api/v1/vendas")
@Tag(name = "Venda", description = "Endpoints para gerenciar vendas")
public class VendaController {

    private final VendaService vendaService;

    public VendaController(VendaService vendaService) {
        this.vendaService = vendaService;
    }

    @Operation(summary = "Salvar Venda")
    @PostMapping(value = "/salvar")
    public Venda salvarVenda(@RequestBody Venda venda) {
        return vendaService.salvar(venda);
    }

    @Operation(summary = "Listar todas Vendas")
    @GetMapping(value = "/listarTodos")
    public List<Venda> findAll() {
        return vendaService.findAll();
    }

    @Operation(summary = "Pesquisar Venda por ID")
    @GetMapping("/pesquisar/{id}")
    public Venda findById(@PathVariable("id") Integer id) {
        return vendaService.findById(id);
    }

    @Operation(summary = "Atualizar Venda")
    @PutMapping(value = "/atualizar")
    public Venda atualizarVenda(@RequestBody Venda venda) {
        return vendaService.atualizar(venda);
    }

    @Operation(summary = "Deletar Venda")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        vendaService.delete(id);
        return ResponseEntity.ok().build();
    }
}
