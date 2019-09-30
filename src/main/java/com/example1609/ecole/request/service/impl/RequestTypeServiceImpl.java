package com.example1609.ecole.request.service.impl;

import com.example1609.ecole.request.entity.RequestTypeEntity;
import com.example1609.ecole.request.repo.RequestTypeRepository;
import com.example1609.ecole.request.service.RequestTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestTypeServiceImpl implements RequestTypeService {

    private final RequestTypeRepository requestTypeRepository;

    public RequestTypeServiceImpl(RequestTypeRepository requestTypeRepository) {
        this.requestTypeRepository = requestTypeRepository;
    }

    @Override
    public List<RequestTypeEntity> getRequestTypeEntityList() {
        List<RequestTypeEntity> requestTypes;
        requestTypes = requestTypeRepository.findAll();
        return requestTypes;
    }

    @Override
    public RequestTypeEntity findRequestTypeEntityById(Integer id) {
        if (id != null)
            return requestTypeRepository.getById(id);
        return null;
    }

    @Override
    public RequestTypeEntity save(RequestTypeEntity requestType) {
        return requestTypeRepository.save(requestType);
    }

    @Override
    public RequestTypeEntity edit(RequestTypeEntity requestType) {
        return requestTypeRepository.save(requestType);
    }

    @Override
    public void delete(Integer id) {
        requestTypeRepository.delete(findRequestTypeEntityById(id));
    }

    @Override
    public RequestTypeEntity findRequestTypeEntityByValue(String value) {
        if (value != null)
            return requestTypeRepository.getByValue(value);
        return null;
    }
}
