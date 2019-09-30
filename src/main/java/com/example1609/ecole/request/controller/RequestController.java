package com.example1609.ecole.request.controller;

import com.example1609.ecole.request.entity.RequestAttributeValueEntity;
import com.example1609.ecole.request.entity.RequestAttributeValueId;
import com.example1609.ecole.request.entity.RequestEntity;
import com.example1609.ecole.request.service.RequestAttributeValueService;
import com.example1609.ecole.request.service.RequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/request")
@CrossOrigin(origins = "http://localhost:4300")
public class RequestController {


    private final RequestService requestService;

    private final RequestAttributeValueService requestAttributeValueService;

    public RequestController(RequestService requestService, RequestAttributeValueService requestAttributeValueService) {
        this.requestService = requestService;
        this.requestAttributeValueService = requestAttributeValueService;
    }

    @GetMapping
    public List<RequestEntity> getAllEcoles() {
        return requestService.getRequestEntityList();
    }

    @GetMapping("/{id}")
    public RequestEntity GetRequestEntityById(@PathVariable("id") Integer id) {
        return requestService.findRequestEntityById(id);
    }

    @PostMapping
    public void createRequestEntity(@RequestBody RequestEntity request) {
        final List<RequestAttributeValueEntity> requestAttributeValueEntity = request.getAttributeValues();
        RequestEntity newRequestEntity = requestService.save(request);
        requestAttributeValueEntity.forEach(requestAttributeValue -> {
            requestAttributeValue.setId(new RequestAttributeValueId(newRequestEntity.getId(), requestAttributeValue.getId().getAttribute_id()));
            requestAttributeValueService.save(requestAttributeValue);
        });
    }
    @PostMapping("/save")
    public RequestEntity createRequestEntityOnly(@RequestBody RequestEntity request) {
        RequestEntity newRequestEntity = requestService.save(request);
        return newRequestEntity;
    }

    @PutMapping("/{id}")
    public RequestEntity edit(@PathVariable("id") Integer id, @RequestBody RequestEntity request) {
        RequestEntity editedrequest = requestService.edit(request);
        return editedrequest;
    }

    @DeleteMapping("/{id}")
    public void deleteRequestEntity(@PathVariable("id") Integer id) {
        requestService.delete(id);
    }
}
