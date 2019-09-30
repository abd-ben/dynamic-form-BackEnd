package com.example1609.ecole.request.repo;

import com.example1609.ecole.request.entity.RequestAttributeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestAttributeRepository extends JpaRepository<RequestAttributeEntity, Integer> {
    RequestAttributeEntity getById(Integer id);
}
