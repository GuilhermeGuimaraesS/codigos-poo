package br.edu.ufrb.gcet236.exercicio_classes_2.data.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ufrb.gcet236.exercicio_classes_2.data.requests.Data;
import br.edu.ufrb.gcet236.exercicio_classes_2.data.responses.Saida;

@RestController
@RequestMapping("api")
public class DataController {   

    @PostMapping("/data")
    public Saida main() {
        // Data dataAlterada = new Data(8, 5, 2020);
        // String dataFormatada = dataAlterada.getData();
        Data dataAlterada = new Data();
        dataAlterada.proximoDia();
        String dataDoDiaSeguinteFormatada = dataAlterada.getData();
        Saida saida = new Saida(dataDoDiaSeguinteFormatada);
        return saida;
    }
}
