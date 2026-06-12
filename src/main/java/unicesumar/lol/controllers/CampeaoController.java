package unicesumar.lol.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;
import unicesumar.lol.models.CampeaoModel;
import unicesumar.lol.services.CampeaoService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "/campeoes")
public class CampeaoController {

    @Autowired
    private CampeaoService campeaoService;

    @GetMapping
    public List<CampeaoModel> findAll() {
        return campeaoService.findAll();
    }

    @GetMapping("/{nome}")
    public Optional<CampeaoModel> findByNome(@PathVariable String nome) {
        return campeaoService.findByNome(nome);
    }

    @PostMapping
    public ResponseEntity<CampeaoModel> save(@RequestBody CampeaoModel campeao) {
        if (campeao.getNome() == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(campeaoService.save(campeao));
    }

}
