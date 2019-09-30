package com.example1609.ecole.request.service;

import com.example1609.ecole.request.entity.RequestTypeEntity;

import java.util.List;

public interface RequestTypeService {

    public List<RequestTypeEntity> getRequestTypeEntityList();

    public RequestTypeEntity findRequestTypeEntityById(Integer id);

    public RequestTypeEntity save(RequestTypeEntity requestTypeEntity);

    public RequestTypeEntity edit(RequestTypeEntity requestTypeEntity);

    public void delete(Integer id);

    public RequestTypeEntity findRequestTypeEntityByValue(String value);
}
