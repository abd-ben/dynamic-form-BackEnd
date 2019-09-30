package com.example1609.ecole.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Classe implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String nom;

    /*@ManyToOne
    @JoinColumn(name = "idEcole")
    private Ecole ecole;*/

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "idClasse")
    private List<Etudiant> etudiants = new ArrayList<>();
}
