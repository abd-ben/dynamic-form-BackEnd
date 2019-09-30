package com.example1609.ecole.repo.exemple;

import com.example1609.ecole.entity.exemple.CandidatSkills;
import com.example1609.ecole.entity.exemple.CandidatSkillsId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatSkillsRepository extends JpaRepository<CandidatSkills, CandidatSkillsId> {
}
