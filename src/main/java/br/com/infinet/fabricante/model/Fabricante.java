package br.com.infinet.fabricante.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fabricante")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Fabricante {
    @Id
    private String id;
    private String nome;
    private String pais;
}
