package com.example1609.ecole.entity.exemple;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TesteCandidatSkillsId implements Serializable {

    @Column(name = "idTeste")
    private Integer idTeste;

    @Column(name = "idCandidatSkills")
    private CandidatSkillsId idCandidatSkills;

    public TesteCandidatSkillsId() {
    }

    public TesteCandidatSkillsId(Integer idTeste, CandidatSkillsId idCandidatSkills) {
        this.idTeste = idTeste;
        this.idCandidatSkills = idCandidatSkills;
    }
}
