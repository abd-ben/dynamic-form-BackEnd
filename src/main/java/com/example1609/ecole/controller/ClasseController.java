package com.example1609.ecole.controller;

import com.example1609.ecole.entity.Classe;
import com.example1609.ecole.service.ClasseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classe")
public class ClasseController {

    private final ClasseService classeService;

    public ClasseController(ClasseService classeService) {
        this.classeService = classeService;
    }

    @GetMapping
    public List<Classe> getAllEcoles() {
        return classeService.getClasseList();
    }

    @GetMapping("/{id}")
    public Classe GetClasseById(@PathVariable("id") Integer id) {
        return classeService.findClasseById(id);
    }

    @PostMapping
    public Classe createClasse(@RequestBody Classe classe) {
        Classe newClasse = classeService.save(classe);
        return newClasse;
    }

    @PutMapping("/{id}")
    public Classe edit(@PathVariable("id") Integer id, @RequestBody Classe classe) {
        Classe editedclasse = classeService.edit(classe);
        return editedclasse;
    }

    @DeleteMapping("/{id}")
    public void deleteClasse(@PathVariable("id") Integer id) {
        classeService.delete(id);
    }
}
