package com.example1609.ecole.request.service;

import com.example1609.ecole.request.entity.RequestEntity;

import java.util.List;

public interface RequestService {

    public List<RequestEntity> getRequestEntityList();

    public RequestEntity findRequestEntityById(Integer id);

    public RequestEntity save(RequestEntity requestEntity);

    public void saveWithAttributes(RequestEntity requestEntity);

    public RequestEntity edit(RequestEntity requestEntity);

    public void delete(Integer id);
}
