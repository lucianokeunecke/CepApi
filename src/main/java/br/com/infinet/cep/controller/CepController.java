package br.com.infinet.cep.controller;

import br.com.infinet.cep.model.CepModel;
import br.com.infinet.cep.service.CepService;
import br.com.infinet.cep.service.GerarExcecaoAleatoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/cep")
public class CepController implements Serializable {

    private static final long serialVersionUID = 6046704732666502085L;

    @Autowired
    CepService cepService;

    @Autowired
    GerarExcecaoAleatoriaService gerarExcecaoAleatoriaService;

    @GetMapping(value="/{numeroCep}")
    public ResponseEntity<CepModel> pesquisar(@PathVariable(name = "numeroCep") String numeroCep) {

        gerarExcecaoAleatoriaService.gerar();

        CepModel cepModel = cepService.pesquisar(numeroCep);

        return new ResponseEntity<CepModel>(cepModel, HttpStatus.OK);
    }
}
