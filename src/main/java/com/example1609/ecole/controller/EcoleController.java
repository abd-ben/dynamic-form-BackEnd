package com.example1609.ecole.controller;

import com.example1609.ecole.entity.Ecole;
import com.example1609.ecole.service.EcoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ecole")
public class EcoleController {


    private final EcoleService ecoleService;

    public EcoleController(EcoleService ecoleService) {
        this.ecoleService = ecoleService;
    }

    @GetMapping
    public ResponseEntity<List<Ecole>> getAllEcoles() {
        return new ResponseEntity<>(ecoleService.getEcoleList(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ecole> GetEcoleById(@PathVariable("id") Integer id) {
        Ecole ecole = ecoleService.findEcoleById(id);
        if (ecole != null)
            return new ResponseEntity<>(ecole, HttpStatus.OK);
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Ecole> createEcole(@RequestBody Ecole ecole) {
        Ecole newEcole = ecoleService.save(ecole);
        if (newEcole != null)
            return new ResponseEntity<>(newEcole, HttpStatus.OK);
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ecole> edit(@PathVariable("id") Integer id, @RequestBody Ecole ecole) {
        Ecole editedecole = ecoleService.edit(ecole);
        if (editedecole != null)
            return new ResponseEntity<>(editedecole, HttpStatus.OK);
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseBody> deleteEcole(@PathVariable("id") Integer id) {
        ecoleService.delete(id);
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }
}
