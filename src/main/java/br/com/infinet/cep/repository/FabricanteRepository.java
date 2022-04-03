package br.com.infinet.cep.repository;

import br.com.infinet.cep.model.Fabricante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FabricanteRepository extends MongoRepository<Fabricante,String> {
    Optional<Fabricante> findByNome(String nome);
}
