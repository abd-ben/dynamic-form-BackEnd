package com.example1609.ecole.entity.exemple;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class CandidatSkills implements Serializable {

    @EmbeddedId
    private CandidatSkillsId id;

    @ManyToOne
    @JoinColumn(name = "idCandidat", insertable = false, updatable = false)
    private Candidat candidat;

    @ManyToOne
    @JoinColumn(name = "idSkills", insertable = false, updatable = false)
    private Skills skills;

    @OneToMany(mappedBy = "candidatSkills")
    private List<TesteCandidatSkills> testeCandidatSkills;

    public CandidatSkills() {}

    public CandidatSkills(CandidatSkillsId id) {
        this.id = id;
    }
}
