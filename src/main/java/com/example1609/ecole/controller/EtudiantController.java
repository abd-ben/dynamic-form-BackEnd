package com.example1609.ecole.controller;

import com.example1609.ecole.entity.Etudiant;
import com.example1609.ecole.service.EtudiantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {


    private final EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @GetMapping
    public List<Etudiant> getAllEcoles() {
        return etudiantService.getEtudiantList();
    }

    @GetMapping("/{id}")
    public Etudiant GetEtudiantById(@PathVariable("id") Integer id) {
        return etudiantService.findEtudiantById(id);
    }

    @PostMapping
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        Etudiant newEtudiant = etudiantService.save(etudiant);
        return newEtudiant;
    }

    @PutMapping("/{id}")
    public Etudiant edit(@PathVariable("id") Integer id, @RequestBody Etudiant etudiant) {
        Etudiant editedetudiant = etudiantService.edit(etudiant);
        return editedetudiant;
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable("id") Integer id) {
        etudiantService.delete(id);
    }
}
