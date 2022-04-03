package br.com.infinet.cep.service;

import br.com.infinet.cep.model.Fabricante;

import java.util.List;
import java.util.Optional;

public interface FabricanteService {
    void save(Fabricante fabricante);
    List<Fabricante> getAll();
    Optional<Fabricante> getById(String id);
    Optional<Fabricante> findByNome(String nome);

}
