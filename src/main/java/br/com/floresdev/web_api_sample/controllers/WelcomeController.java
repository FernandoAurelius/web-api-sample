package br.com.floresdev.web_api_sample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Um RestController é uma classe que possui anotações específicas para disponibilização de recursos
 * HTTPs baseados nos serviços e regras de negócio: "é quem expõe os endpoints da API para o mundo"
 * <hr>
 * Um @RestController define o Bean de Component que suporta requisições HTTP com base no REST
 * <hr>
 * Um @RequestMapping define a URI comum para todos os recursos disponibilizados pelo Controller
 * <hr>
 * Um @GetMapping determina que o verbo HTTP aceito pelo endpoint será o GET
 * <hr>
 * Um @PostMapping determina que o verbo HTTP aceito pelo endpoint será o POST
 * <hr>
 * Um @PutMapping determina que o verbo HTTP aceito pelo endpoint será o PUT
 * <hr>
 * Um @DeleteMapping determina que o verbo HTTP aceito pelo endpoint será o DELETE
 * <hr>
 * A anotação @RequestBody converte um JSON para o tipo do objeto esperado como parâmetro funcional
 * <hr>
 * A anotação @PathVariable determina que parte da URI será composta por parâmetros recebidos nas requisições
 * */
@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Welcome to my Web API Sample!";
    }
}
