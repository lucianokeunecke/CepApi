package br.com.infinet.cep.service.impl;

import br.com.infinet.cep.model.CepModel;
import br.com.infinet.cep.service.CepService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
public class CepServiceImpl implements CepService {

    private static final Logger LOGGER = Logger.getLogger(CepServiceImpl.class.getName());

    @Override
    public CepModel pesquisar(String numeroCep) {

        RestTemplate restTemplate = new RestTemplate();

        String uri = "http://viacep.com.br/ws/" + numeroCep + "/json/";

        LOGGER.info(String.format("Comunicando-se com o WebService ViaCep: %s ", uri));

        return restTemplate.getForObject(uri, CepModel.class);
    }
}
