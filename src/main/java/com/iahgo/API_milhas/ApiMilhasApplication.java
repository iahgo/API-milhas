package com.iahgo.API_milhas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.iahgo.API_milhas.Model.service.DataLoaderService;

@SpringBootApplication
@EnableFeignClients
public class ApiMilhasApplication {

    @Autowired
    private DataLoaderService dataLoaderService;

    public static void main(String[] args) {
        SpringApplication.run(ApiMilhasApplication.class, args);
    }

    // @Bean
    // CommandLineRunner runner() {
    // System.out.println("entrou no api milhas ");
    //     return args -> {
    //         dataLoaderService.loadDataFromFile("src/main/resources/data.txt");
    //     };
    // }
}
