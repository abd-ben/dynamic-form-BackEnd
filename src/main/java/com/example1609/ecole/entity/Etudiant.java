package com.example1609.ecole.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String nom;

    /*@ManyToOne
    @JoinColumn(name = "idClasse")
    private Classe classe;*/
}
