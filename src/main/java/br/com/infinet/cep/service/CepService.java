package br.com.infinet.cep.service;

import br.com.infinet.cep.model.CepModel;

public interface CepService {

    CepModel pesquisar(String numeroCep);
}
