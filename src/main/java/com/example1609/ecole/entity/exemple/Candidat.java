package com.example1609.ecole.entity.exemple;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Candidat implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String nom;

    @OneToMany(mappedBy = "candidat")
    private List<CandidatSkills> skills;

    public Candidat() {}

    public Candidat(String nom) {
        this.nom = nom;
    }
}
