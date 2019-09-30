package com.example1609.ecole.request.service;

import com.example1609.ecole.request.entity.RequestAttributeValueEntity;
import com.example1609.ecole.request.entity.RequestAttributeValueId;

import java.util.List;

public interface RequestAttributeValueService {

    public List<RequestAttributeValueEntity> getRequestAttributeValueEntityList();

    public RequestAttributeValueEntity findRequestAttributeValueEntityById(RequestAttributeValueId id);

    public RequestAttributeValueEntity save(RequestAttributeValueEntity requestAttributeValueEntity);

    public RequestAttributeValueEntity edit(RequestAttributeValueEntity requestAttributeValueEntity);

    public void delete(RequestAttributeValueId id);
}
