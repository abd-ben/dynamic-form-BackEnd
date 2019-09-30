package com.example1609.ecole.service;

import com.example1609.ecole.entity.Classe;

import java.util.List;

public interface ClasseService {

    public List<Classe> getClasseList();

    public Classe findClasseById(Integer id);

    public Classe save(Classe classe);

    public Classe edit(Classe classe);

    public void delete(Integer id);
}
