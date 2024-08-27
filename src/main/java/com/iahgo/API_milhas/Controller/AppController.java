package com.iahgo.API_milhas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iahgo.API_milhas.Model.service.DataLoaderService;

@RestController
public class AppController {

    @Autowired
    private DataLoaderService dataLoaderService;

    @GetMapping("/loadData")
    public String loadData(@RequestParam String filePath) {
		filePath = "src/main/resources/data.txt";
        try {
            dataLoaderService.loadDataFromFile(filePath);
            return "Dados carregados com sucesso!";
        } catch (Exception e) {
            return "Erro ao carregar dados: " + e.getMessage();
        }
    }
}
