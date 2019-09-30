package com.example1609.ecole.request.controller;

import com.example1609.ecole.request.entity.RequestTypeEntity;
import com.example1609.ecole.request.service.RequestTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requestType")
@CrossOrigin(origins = "http://localhost:4300")
public class RequestTypeController {


    private final RequestTypeService requestTypeService;

    public RequestTypeController(RequestTypeService requestTypeService) {
        this.requestTypeService = requestTypeService;
    }

    @GetMapping
    public List<RequestTypeEntity> getAllEcoles() {
        return requestTypeService.getRequestTypeEntityList();
    }

    @GetMapping("/{id}")
    public RequestTypeEntity GetRequestTypeEntityById(@PathVariable("id") Integer id) {
        return requestTypeService.findRequestTypeEntityById(id);
    }

    @GetMapping("/value/{value}")
    public RequestTypeEntity GetRequestTypeEntityByValue(@PathVariable("value") String value) {
        return requestTypeService.findRequestTypeEntityByValue(value);
    }

    @PostMapping
    public RequestTypeEntity createRequestTypeEntity(@RequestBody RequestTypeEntity requestType) {
        RequestTypeEntity newRequestTypeEntity = requestTypeService.save(requestType);
        return newRequestTypeEntity;
    }

    @PutMapping("/{id}")
    public RequestTypeEntity edit(@PathVariable("id") Integer id, @RequestBody RequestTypeEntity requestType) {
        RequestTypeEntity editedrequestType = requestTypeService.edit(requestType);
        return editedrequestType;
    }

    @DeleteMapping("/{id}")
    public void deleteRequestTypeEntity(@PathVariable("id") Integer id) {
        requestTypeService.delete(id);
    }
}
