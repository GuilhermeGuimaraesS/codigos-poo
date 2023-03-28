package br.edu.ufrb.gcet236.carros.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufrb.gcet236.carros.entities.Carro;
import br.edu.ufrb.gcet236.carros.entities.Estoque;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api")
public class CarroController {
    
    public Estoque estoque = new Estoque();

    @PostMapping(value = "/estoque/adicionar")
    public ResponseEntity<String> adicionar(@RequestBody Carro carro) {
        this.estoque.adicionarCarro(carro);
        return ResponseEntity.ok(carro.informaçoesDoCarro());
    }
    
    @PostMapping(value = "/estoque/exibir")
    public ResponseEntity<ArrayList <Carro>> mostrarEstoque() {
        return ResponseEntity.status(HttpStatus.OK).body(estoque.getEstoqueDeCarros());
    }

    @PostMapping(value = "/estoque/remover")
    public ResponseEntity removerCarro(Carro carro) {
        String status = estoque.buscarCarro(carro);
        if (status == "DISPONÍVEL") {
            return ResponseEntity.ok(estoque.removerCarro(carro)); 
        } else {
            return ResponseEntity.status(HttpStatus.OK).body("ERRO! Carro não encontrado");
        } 
    }
}
