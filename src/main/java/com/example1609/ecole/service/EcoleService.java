package com.example1609.ecole.service;

import com.example1609.ecole.entity.Ecole;

import java.util.List;

public interface EcoleService {

    public List<Ecole> getEcoleList();

    public Ecole findEcoleById(Integer id);

    public Ecole save(Ecole ecole);

    public Ecole edit(Ecole ecole);

    public void delete(Integer id);
}
