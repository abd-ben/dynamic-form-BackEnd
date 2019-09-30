package com.example1609.ecole.repo.exemple;

import com.example1609.ecole.entity.exemple.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatRepository extends JpaRepository<Candidat, Integer> {
}
