package com.example1609.ecole.request.service;

import com.example1609.ecole.request.entity.RequestAttributeEntity;

import java.util.List;

public interface RequestAttributeService {

    public List<RequestAttributeEntity> getRequestAttributeEntityList();

    public RequestAttributeEntity findRequestAttributeEntityById(Integer id);

    public RequestAttributeEntity save(RequestAttributeEntity requestAttributeEntity);

    public RequestAttributeEntity edit(RequestAttributeEntity requestAttributeEntity);

    public void delete(Integer id);
}
