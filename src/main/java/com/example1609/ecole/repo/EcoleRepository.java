package com.example1609.ecole.repo;

import com.example1609.ecole.entity.Ecole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EcoleRepository extends JpaRepository<Ecole, Integer> {
    Ecole getById(Integer id);
}
