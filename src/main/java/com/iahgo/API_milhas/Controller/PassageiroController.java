package com.iahgo.API_milhas.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.iahgo.API_milhas.Model.domain.Passageiro;
import com.iahgo.API_milhas.Model.service.PassageiroService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/api/v1/passageiros")
@Tag(name = "Passageiro", description = "Endpoints para gerenciar passageiros")
public class PassageiroController {

    private final PassageiroService passageiroService;

    public PassageiroController(PassageiroService passageiroService) {
        this.passageiroService = passageiroService;
    }

    @Operation(summary = "Salvar Passageiro")
    @PostMapping(value = "/salvar")
    public Passageiro salvarPassageiro(@RequestBody Passageiro passageiro) {
        return passageiroService.salvar(passageiro);
    }

    @Operation(summary = "Listar todos Passageiros")
    @GetMapping(value = "/listarTodos")
    public List<Passageiro> findAll() {
        return passageiroService.findAll();
    }

    @Operation(summary = "Pesquisar Passageiro por ID")
    @GetMapping("/pesquisar/{id}")
    public Passageiro findById(@PathVariable("id") Integer id) {
        return passageiroService.findById(id);
    }

    @Operation(summary = "Atualizar Passageiro")
    @PutMapping(value = "/atualizar")
    public Passageiro atualizarPassageiro(@RequestBody Passageiro passageiro) {
        return passageiroService.atualizar(passageiro);
    }

    @Operation(summary = "Deletar Passageiro")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        passageiroService.delete(id);
        return ResponseEntity.ok().build();
    }
}
