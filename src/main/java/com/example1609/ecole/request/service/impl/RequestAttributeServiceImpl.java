package com.example1609.ecole.request.service.impl;

import com.example1609.ecole.request.entity.RequestAttributeEntity;
import com.example1609.ecole.request.repo.RequestAttributeRepository;
import com.example1609.ecole.request.service.RequestAttributeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestAttributeServiceImpl implements RequestAttributeService {

    private final RequestAttributeRepository requestAttributeRepository;

    public RequestAttributeServiceImpl(RequestAttributeRepository requestAttributeRepository) {
        this.requestAttributeRepository = requestAttributeRepository;
    }

    @Override
    public List<RequestAttributeEntity> getRequestAttributeEntityList() {
        List<RequestAttributeEntity> requestAttributes;
        requestAttributes = requestAttributeRepository.findAll();
        return requestAttributes;
    }

    @Override
    public RequestAttributeEntity findRequestAttributeEntityById(Integer id) {
        if (id != null)
            return requestAttributeRepository.getById(id);
        return null;
    }

    @Override
    public RequestAttributeEntity save(RequestAttributeEntity requestAttribute) {
        return requestAttributeRepository.save(requestAttribute);
    }

    @Override
    public RequestAttributeEntity edit(RequestAttributeEntity requestAttribute) {
        return requestAttributeRepository.save(requestAttribute);
    }

    @Override
    public void delete(Integer id) {
        requestAttributeRepository.delete(findRequestAttributeEntityById(id));
    }
}
