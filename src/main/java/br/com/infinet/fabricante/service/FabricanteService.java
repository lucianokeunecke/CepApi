package br.com.infinet.fabricante.service;

import br.com.infinet.fabricante.model.Fabricante;

import java.util.List;
import java.util.Optional;

public interface FabricanteService {
    void save(Fabricante fabricante);
    List<Fabricante> getAll();
    Optional<Fabricante> getById(String id);
    Optional<Fabricante> findByNome(String nome);

}
