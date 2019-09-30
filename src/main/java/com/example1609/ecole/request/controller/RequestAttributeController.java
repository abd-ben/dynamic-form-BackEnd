package com.example1609.ecole.request.controller;

import com.example1609.ecole.request.entity.RequestAttributeEntity;
import com.example1609.ecole.request.service.RequestAttributeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requestAttribute")
@CrossOrigin(origins = "http://localhost:4300"+"http://localhost:8080" )
public class RequestAttributeController {


    private final RequestAttributeService requestAttributeService;

    public RequestAttributeController(RequestAttributeService requestAttributeService) {
        this.requestAttributeService = requestAttributeService;
    }

    @GetMapping
    public List<RequestAttributeEntity> getAllEcoles() {
        return requestAttributeService.getRequestAttributeEntityList();
    }

    @GetMapping("/{id}")
    public RequestAttributeEntity GetRequestAttributeEntityById(@PathVariable("id") Integer id) {
        return requestAttributeService.findRequestAttributeEntityById(id);
    }

    @PostMapping
    public RequestAttributeEntity createRequestAttributeEntity(@RequestBody RequestAttributeEntity requestAttribute) {
        RequestAttributeEntity newRequestAttributeEntity = requestAttributeService.save(requestAttribute);
        return newRequestAttributeEntity;
    }

    @PutMapping("/{id}")
    public RequestAttributeEntity edit(@PathVariable("id") Integer id, @RequestBody RequestAttributeEntity requestAttribute) {
        RequestAttributeEntity editedrequestAttribute = requestAttributeService.edit(requestAttribute);
        return editedrequestAttribute;
    }

    @DeleteMapping("/{id}")
    public void deleteRequestAttributeEntity(@PathVariable("id") Integer id) {
        requestAttributeService.delete(id);
    }
}
