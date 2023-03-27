package br.edu.ufrb.gcet236.input_output.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufrb.gcet236.input_output.mundo_animal.Crocodilo;


/**
 * Example controller
 * 
 * @author Guilherme G Santos
 */

@RestController
@RequestMapping("api/example")
public class MainController {

    @GetMapping("/crocodilo")
    public ResponseEntity<String> crocodilo() {
        Crocodilo crocodiloDundee = new Crocodilo();
        System.out.println(crocodiloDundee.getCor()); 
        crocodiloDundee.setCor("vermelho");
        System.out.println(crocodiloDundee.getCor());        

        return ResponseEntity.ok("Hello World!");
    }
    
}


