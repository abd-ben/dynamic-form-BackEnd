package com.example1609.ecole.request.service.impl;

import com.example1609.ecole.request.entity.RequestAttributeValueId;
import com.example1609.ecole.request.entity.RequestEntity;
import com.example1609.ecole.request.repo.RequestRepository;
import com.example1609.ecole.request.service.RequestAttributeValueService;
import com.example1609.ecole.request.service.RequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {

    private final RequestRepository requestRepository;

    private final RequestAttributeValueService requestAttributeValueService;


    public RequestServiceImpl(RequestRepository requestRepository, RequestAttributeValueService requestAttributeValueService) {
        this.requestRepository = requestRepository;
        this.requestAttributeValueService = requestAttributeValueService;
    }

    @Override
    public List<RequestEntity> getRequestEntityList() {
        List<RequestEntity> requests;
        requests = requestRepository.findAll();
        return requests;
    }

    @Override
    public RequestEntity findRequestEntityById(Integer id) {
        if (id != null) {
            return requestRepository.getById(id);
        }
        return null;
    }

    @Override
    public RequestEntity save(RequestEntity request) {
        RequestEntity requestEntity = request;
        requestEntity.setAttributeValues(null);
        return requestRepository.save(requestEntity);
    }

    @Override
    public void saveWithAttributes(RequestEntity request) {
        RequestEntity entity = save(request);
        request.getAttributeValues().forEach(requestAttributeValue -> {
            requestAttributeValue.setId(new RequestAttributeValueId(entity.getId(), requestAttributeValue.getId().getAttribute_id()));
            requestAttributeValueService.save(requestAttributeValue);
        });
    }

    @Override
    public RequestEntity edit(RequestEntity request) {
        return requestRepository.save(request);
    }

    @Override
    public void delete(Integer id) {
        requestRepository.delete(findRequestEntityById(id));
    }
}
