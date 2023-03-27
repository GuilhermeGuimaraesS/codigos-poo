package br.edu.ufrb.gcet236.classes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufrb.gcet236.classes.requests.Fatura;
import br.edu.ufrb.gcet236.classes.responses.Saida;

@RestController
@RequestMapping("api")
public class MainController {

    @PostMapping(value = "/main")
    public ResponseEntity<Double> main(@RequestBody Fatura fatura) {
        fatura.setDescricaoItem("Sapato do filme crocodilo dundee");
        //  return ResponseEntity.ok("Hello. World"); 
        return ResponseEntity.ok(fatura.getTotalFatura());
    }

}
    