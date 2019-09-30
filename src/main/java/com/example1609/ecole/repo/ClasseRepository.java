package com.example1609.ecole.repo;

import com.example1609.ecole.entity.Classe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClasseRepository extends JpaRepository<Classe, Integer> {
    Classe getById(Integer id);
}
