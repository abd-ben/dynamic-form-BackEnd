package com.example1609.ecole.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Ecole implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String nom;
    private String adresse;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "idEcole")
    private List<Classe> classes = new ArrayList<>();
}
