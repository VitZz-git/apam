package dev.java10x.apam.Missoes;

import dev.java10x.apam.Ninjas.NinjaController;
import dev.java10x.apam.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String nomeDaMissao;

    private String dificuldade ;

    //uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    @JoinColumn
    private List<NinjaModel> Ninjas;
}
