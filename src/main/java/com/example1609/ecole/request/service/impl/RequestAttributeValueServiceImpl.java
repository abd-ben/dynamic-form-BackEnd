package com.example1609.ecole.request.service.impl;

import com.example1609.ecole.request.entity.RequestAttributeValueEntity;
import com.example1609.ecole.request.entity.RequestAttributeValueId;
import com.example1609.ecole.request.repo.RequestAttributeValueRepository;
import com.example1609.ecole.request.service.RequestAttributeValueService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestAttributeValueServiceImpl implements RequestAttributeValueService {

    private final RequestAttributeValueRepository requestAttributeValueRepository;

    public RequestAttributeValueServiceImpl(RequestAttributeValueRepository requestAttributeValueRepository) {
        this.requestAttributeValueRepository = requestAttributeValueRepository;
    }

    @Override
    public List<RequestAttributeValueEntity> getRequestAttributeValueEntityList() {
        List<RequestAttributeValueEntity> requestAttributeValueEntities;
        requestAttributeValueEntities = requestAttributeValueRepository.findAll();
        return requestAttributeValueEntities;
    }

    @Override
    public RequestAttributeValueEntity findRequestAttributeValueEntityById(RequestAttributeValueId id) {
        if (id != null)
            return requestAttributeValueRepository.getById(id);
        return null;
    }

    @Override
    public RequestAttributeValueEntity save(RequestAttributeValueEntity requestAttributeValueEntity) {
        return requestAttributeValueRepository.save(requestAttributeValueEntity);
    }

    @Override
    public RequestAttributeValueEntity edit(RequestAttributeValueEntity requestAttributeValueEntity) {
        return requestAttributeValueRepository.save(requestAttributeValueEntity);
    }

    @Override
    public void delete(RequestAttributeValueId id) {
        requestAttributeValueRepository.delete(findRequestAttributeValueEntityById(id));
    }
}
