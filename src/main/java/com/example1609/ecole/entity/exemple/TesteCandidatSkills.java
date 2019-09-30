package com.example1609.ecole.entity.exemple;

import lombok.Data;
import org.aspectj.weaver.ast.Test;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class TesteCandidatSkills implements Serializable {

    @EmbeddedId
    private TesteCandidatSkillsId id;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "idCandidat", insertable = false, updatable = false),
            @JoinColumn(name = "idSkills", insertable = false, updatable = false)
    })
    private CandidatSkills candidatSkills;

    @ManyToOne
    @JoinColumn(name = "idTeste", insertable = false, updatable = false)
    private Teste teste;

    public TesteCandidatSkills() {}

    public TesteCandidatSkills(TesteCandidatSkillsId id) {
        this.id = id;
    }
}
