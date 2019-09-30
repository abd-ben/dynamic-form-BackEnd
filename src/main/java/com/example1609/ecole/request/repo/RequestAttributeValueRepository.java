package com.example1609.ecole.request.repo;

import com.example1609.ecole.request.entity.RequestAttributeValueEntity;
import com.example1609.ecole.request.entity.RequestAttributeValueId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestAttributeValueRepository extends JpaRepository<RequestAttributeValueEntity, RequestAttributeValueId> {
    RequestAttributeValueEntity getById(RequestAttributeValueId id);
}
