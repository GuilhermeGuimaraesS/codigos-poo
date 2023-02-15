package br.edu.ufrb.gcet236.hello.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* ExampleController
* 
* @author Daniel Padua
*/
@RestController
@RequestMapping("api/example")
public class HelloController {

    @GetMapping("/hello-world")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello, World!");
    }

    // @GetMapping("/hello")
    // public ResponseEntity<String> get(@RequestParam String nome) {
    //     return ResponseEntity.ok("Olá " + nome + "!");
    // }
}
