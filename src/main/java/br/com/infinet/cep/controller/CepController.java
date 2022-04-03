package br.com.infinet.cep.controller;

import br.com.infinet.cep.model.CepModel;
import br.com.infinet.cep.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
public class CepController implements Serializable {

    private static final long serialVersionUID = 6046704732666502085L;

    @Autowired
    CepService cepService;

    @GetMapping(value="/cep/{numeroCep}")
    public ResponseEntity<CepModel> pesquisar(@PathVariable(name = "numeroCep") String numeroCep) {

        CepModel cepModel = cepService.pesquisar(numeroCep);

        return new ResponseEntity<CepModel>(cepModel, HttpStatus.OK);
    }
}
