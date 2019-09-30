package com.example1609.ecole.service.impl;

import com.example1609.ecole.entity.Etudiant;
import com.example1609.ecole.repo.EtudiantRepository;
import com.example1609.ecole.service.EtudiantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServiceImpl implements EtudiantService {

    private final EtudiantRepository etudiantRepository;

    public EtudiantServiceImpl(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    @Override
    public List<Etudiant> getEtudiantList() {
        List<Etudiant> etudiants;
        etudiants = etudiantRepository.findAll();
        return etudiants;
    }

    @Override
    public Etudiant findEtudiantById(Integer id) {
        if (id != null)
            return etudiantRepository.getById(id);
        return null;
    }

    @Override
    public Etudiant save(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant edit(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void delete(Integer id) {
        etudiantRepository.delete(findEtudiantById(id));
    }
}
