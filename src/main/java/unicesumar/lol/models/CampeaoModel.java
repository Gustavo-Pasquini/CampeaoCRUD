package unicesumar.lol.models;

import jakarta.persistence.*;
import lombok.Data;
import unicesumar.lol.enums.Funcoes;

import java.util.UUID;

@Entity
@Data
@Table(name="tbl_name")
public class CampeaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;
    private Funcoes funcao;
    private String elo;


}
