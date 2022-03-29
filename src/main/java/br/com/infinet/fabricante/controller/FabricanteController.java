package br.com.infinet.fabricante.controller;

import br.com.infinet.fabricante.model.Fabricante;
import br.com.infinet.fabricante.service.FabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.SplittableRandom;

@RestController
@RequestMapping("/fabricante")
public class FabricanteController {
    @Autowired
    FabricanteService fabricanteService;
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Fabricante fabricante){
        this.fabricanteService.save(fabricante);
        return ResponseEntity.ok().body("OK");
    }
    @GetMapping
    public ResponseEntity<List<Fabricante>> getAll(){
        List<Fabricante> all = this.fabricanteService.getAll();
        return ResponseEntity.ok().body(all);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable  String id){
        Optional<Fabricante> byId = this.fabricanteService.getById(id);
        if(byId.isPresent()) return ResponseEntity.ok().body(byId.get());
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/nome/{nome}")
    public ResponseEntity<?> getByNome(@PathVariable String nome){
        SplittableRandom random = new SplittableRandom();
        Optional<Fabricante> byNome = this.fabricanteService.findByNome(nome);

        int i = random.nextInt(1000);
        if(i > 800){
            try{
                int i1 = 10 / 0;
            }catch (RuntimeException ex){
                ex.printStackTrace();
                return ResponseEntity.notFound().build();
            }

        }
        if(byNome.isPresent()) return ResponseEntity.ok().body(byNome.get());
        return ResponseEntity.notFound().build();
    }
}
