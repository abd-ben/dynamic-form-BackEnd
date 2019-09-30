package com.example1609.ecole.entity.exemple;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Skills implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String nom;

    @OneToMany( mappedBy = "skills")
    private List<CandidatSkills> candidats;

    public Skills() {}

    public Skills(String nom) {
        this.nom = nom;
    }
}
