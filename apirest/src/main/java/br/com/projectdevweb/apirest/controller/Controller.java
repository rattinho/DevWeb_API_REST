package br.com.projectdevweb.apirest.controller;

import java.nio.file.Files;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.*;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.file.Path;

@RestController
public class Controller {
    @GetMapping("/")
    @ResponseBody
    public String showDocumentation() throws IOException {
        Resource resource = new ClassPathResource("static/index.html");
        Path path = Path.of(resource.getURI());

        // Lê o conteúdo do arquivo HTML e o retorna como String
        return Files.readString(path);
    }

}
