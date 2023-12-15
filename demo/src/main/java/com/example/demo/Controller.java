package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/")
    public String hello() {
        return "Informações da API";
    }

    @GetMapping("/api/{algumaCoisa}/{umN}")
    public String operacoesDaAPI(@PathVariable String algumaCoisa, @PathVariable Integer umN) {
        // Realize as operações específicas com base no valor de "algumaCoisa"
        return "Operações com " + algumaCoisa + umN;
    }
}
