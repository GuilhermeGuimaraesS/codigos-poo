package br.edu.ufrb.gcet236.input_output.controllers;

// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.ufrb.gcet236.input_output.requests.Entrada;
import br.edu.ufrb.gcet236.input_output.responses.Saida;

/**
 * Example controller
 * 
 * @author Guilherme G Santos
 */
@RestController
@RequestMapping("api")
public class MainController {
    
    @PostMapping("/main")
    public Saida main(@RequestBody Entrada entrada) {
        int resultado = entrada.getNumero1() + entrada.getNumero2();
        Saida saida = new Saida(resultado); 
        return saida;
    // public ResponseEntity<String> main(@RequestBody Entrada entrada) {
    //     return ResponseEntity.ok("Hello World!");
    }
    
}
