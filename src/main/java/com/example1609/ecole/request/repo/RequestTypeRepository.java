package com.example1609.ecole.request.repo;

import com.example1609.ecole.request.entity.RequestTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestTypeRepository extends JpaRepository<RequestTypeEntity, Integer> {
    RequestTypeEntity getById(Integer id);
    RequestTypeEntity getByValue(String value);
}
