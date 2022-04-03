package br.com.infinet.cep.controller;

import br.com.infinet.cep.model.CepModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CepController implements Serializable {

    private static final long serialVersionUID = 6046704732666502085L;

    @GetMapping(value="/cep/{cep}")
    public ResponseEntity<CepModel> doObterCep(@PathVariable(name = "cep") String cep) {

        RestTemplate restTemplate = new RestTemplate();

        String uri = "http://viacep.com.br/ws/{cep}/json/";

        Map<String, String> params = new HashMap<String, String>();

        params.put("cep", cep);

        CepModel cepModel = restTemplate.getForObject(uri, CepModel.class, params);

        return new ResponseEntity<CepModel>(cepModel, HttpStatus.OK);
    }
}
