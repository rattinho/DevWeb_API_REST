package br.com.projectdevweb.apirest.controller;

import java.nio.file.Files;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.*;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.file.Path;

//Neste Trecho, fazemos com que o caminho raiz da API disponibilize a documentação da mesma
@RestController
public class Controller {
    @GetMapping("/")
    @ResponseBody
    public String showDocumentation() throws IOException {
        Resource resource = new ClassPathResource("static/index.html");
        Path path = Path.of(resource.getURI());
        return Files.readString(path);
    }

}
