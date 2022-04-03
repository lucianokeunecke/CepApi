package br.com.infinet.cep.controller;

import br.com.infinet.cep.model.CepModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
public class CepController implements Serializable {

    private static final long serialVersionUID = 6046704732666502085L;

    @GetMapping(value="/getCep/{cep}")
    public ResponseEntity<CepModel> doObterCep(@PathVariable(name = "cep") String cep) {


        return ResponseEntity.notFound().build();
    }
}
