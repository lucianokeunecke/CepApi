package br.com.infinet.fabricante.repository;

import br.com.infinet.fabricante.model.Fabricante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FabricanteRepository extends MongoRepository<Fabricante,String> {
    Optional<Fabricante> findByNome(String nome);
}
