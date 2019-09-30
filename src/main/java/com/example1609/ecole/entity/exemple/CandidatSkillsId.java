package com.example1609.ecole.entity.exemple;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class CandidatSkillsId implements Serializable {

    @Column(name = "idCandidat")
    private Integer idCandidat;

    @Column(name = "idSkills")
    private Integer idSkills;

    public CandidatSkillsId() {}

    public CandidatSkillsId(Integer idCandidat, Integer idSkills) {
        this.idCandidat = idCandidat;
        this.idSkills = idSkills;
    }
}
