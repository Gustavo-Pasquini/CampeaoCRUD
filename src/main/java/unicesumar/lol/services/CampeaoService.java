package unicesumar.lol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicesumar.lol.models.CampeaoModel;
import unicesumar.lol.repositories.CampeaoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CampeaoService {

    @Autowired
    private CampeaoRepository campeaoRepository;

    public Optional<CampeaoModel> findByNome(String nome) {
        return campeaoRepository.findByNome(nome);
    }

    public List<CampeaoModel> findAll() {
        return campeaoRepository.findAll();
    }

    public CampeaoModel save(CampeaoModel campeao) {
        return campeaoRepository.save(campeao);
    }

}
