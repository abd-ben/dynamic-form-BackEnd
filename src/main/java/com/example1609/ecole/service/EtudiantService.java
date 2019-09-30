package com.example1609.ecole.service;


import com.example1609.ecole.entity.Etudiant;

import java.util.List;

public interface EtudiantService {

    public List<Etudiant> getEtudiantList();

    public Etudiant findEtudiantById(Integer id);

    public Etudiant save(Etudiant etudiant);

    public Etudiant edit(Etudiant etudiant);

    public void delete(Integer id);
}
