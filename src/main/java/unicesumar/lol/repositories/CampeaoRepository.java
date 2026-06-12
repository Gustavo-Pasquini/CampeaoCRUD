package unicesumar.lol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unicesumar.lol.models.CampeaoModel;

import java.util.Optional;
import java.util.UUID;

public interface CampeaoRepository extends JpaRepository<CampeaoModel, UUID> {
    public Optional<CampeaoModel> findByNome(String nome);
}
