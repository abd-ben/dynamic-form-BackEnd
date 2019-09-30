package com.example1609.ecole.service.impl;

import com.example1609.ecole.entity.Classe;
import com.example1609.ecole.repo.ClasseRepository;
import com.example1609.ecole.service.ClasseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasseServiceImpl implements ClasseService {

    private final ClasseRepository classeRepository;

    public ClasseServiceImpl(ClasseRepository classeRepository) {
        this.classeRepository = classeRepository;
    }

    @Override
    public List<Classe> getClasseList() {
        List<Classe> classes;
        classes = classeRepository.findAll();
        return classes;
    }

    @Override
    public Classe findClasseById(Integer id) {
        if (id != null)
            return classeRepository.getById(id);
        return null;
    }

    @Override
    public Classe save(Classe classe) {
        return classeRepository.save(classe);
    }

    @Override
    public Classe edit(Classe classe) {
        return classeRepository.save(classe);
    }

    @Override
    public void delete(Integer id) {
        classeRepository.delete(findClasseById(id));
    }
}
