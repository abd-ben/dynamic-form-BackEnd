package com.example1609.ecole.request.repo;

import com.example1609.ecole.request.entity.RequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<RequestEntity, Integer> {
    RequestEntity getById(Integer id);
}
