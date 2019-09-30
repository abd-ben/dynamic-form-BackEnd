package com.example1609.ecole.repo;

import com.example1609.ecole.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    Etudiant getById(Integer id);
}
