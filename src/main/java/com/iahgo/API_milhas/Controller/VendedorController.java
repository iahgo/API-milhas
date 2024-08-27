package com.iahgo.API_milhas.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.iahgo.API_milhas.Model.domain.Vendedor;
import com.iahgo.API_milhas.Model.service.VendedorService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/api/v1/vendedores")
@Tag(name = "Vendedor", description = "Endpoints para gerenciar vendedores")
public class VendedorController {

    private final VendedorService vendedorService;

    public VendedorController(VendedorService vendedorService) {
        this.vendedorService = vendedorService;
    }

    @Operation(summary = "Salvar Vendedor")
    @PostMapping(value = "/salvar")
    public Vendedor salvarVendedor(@RequestBody Vendedor vendedor) {
        return vendedorService.salvar(vendedor);
    }

    @Operation(summary = "Listar todos Vendedores")
    @GetMapping(value = "/listarTodos")
    public List<Vendedor> findAll() {
        return vendedorService.findAll();
    }

    @Operation(summary = "Pesquisar Vendedor por ID")
    @GetMapping("/pesquisar/{id}")
    public Vendedor findById(@PathVariable("id") Integer id) {
        return vendedorService.findById(id);
    } 

    @Operation(summary = "Atualizar Vendedor")
    @PutMapping(value = "/atualizar")
    public Vendedor atualizarVendedor(@RequestBody Vendedor vendedor) {
        return vendedorService.atualizar(vendedor);
    }

    @Operation(summary = "Deletar Vendedor")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        vendedorService.delete(id);
        return ResponseEntity.ok().build();
    }
}
