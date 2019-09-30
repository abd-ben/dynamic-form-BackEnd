package com.example1609.ecole.entity.exemple;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Teste implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String nom;

    @OneToMany(mappedBy = "teste")
    private List<TesteCandidatSkills> testeCandidatSkills;

    public Teste() {}

    public Teste(String nom) {
        this.nom = nom;
    }
}
