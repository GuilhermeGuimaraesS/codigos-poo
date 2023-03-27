package br.edu.ufrb.gcet236.exercicios_classes_3.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import br.edu.ufrb.gcet236.exercicios_classes_3.entities.Pessoa;
import br.edu.ufrb.gcet236.exercicios_classes_3.entities.Agenda;


@RestController
@RequestMapping("api")
public class PessoasController {
    
    public Agenda agenda = new Agenda();

    @PostMapping(value = "/pessoas/cadastrar")
    public ResponseEntity<String> cadastrar(@RequestBody Pessoa pessoa) {
        this.agenda.armazenaPessoas(pessoa);
        return ResponseEntity.ok(pessoa.imprimirDados());
    }

    @GetMapping(value = "/pessoas/remover")
    public void removerPessoa(@RequestParam String nome) {
        this.agenda.removePessoa(nome);
    }

    @GetMapping(value = "/pessoas/busca")
    public ResponseEntity<String> encontrarPessoa(@RequestParam String nome) {
        int posicaoDaPessoa = this.agenda.buscaPessoa(nome);
        if (posicaoDaPessoa != -1) {
            return ResponseEntity.status(HttpStatus.OK).body("A posição de " + nome + " na agenda é: " + posicaoDaPessoa);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrada para o nome: " + nome);
        }
    }

    @PostMapping(value = "/pessoas/agenda")
    public ResponseEntity<ArrayList <Pessoa>> getAgenda() {
        return ResponseEntity.status(HttpStatus.OK).body(agenda.getListaPessoas());
    }

    @PostMapping(value = "/pessoa")
    public ResponseEntity<String> mostrarDados(@RequestParam int index) {
        // Fazer if e else para verificar se o objeto está vazio ou não
        return ResponseEntity.status(HttpStatus.OK).body(agenda.imprimePessoa(index));
    }
}
