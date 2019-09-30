package com.example1609.ecole.service.impl;

import com.example1609.ecole.entity.Ecole;
import com.example1609.ecole.repo.EcoleRepository;
import com.example1609.ecole.service.EcoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcoleServiceImpl implements EcoleService {

    private final EcoleRepository ecoleRepository;

    public EcoleServiceImpl(EcoleRepository ecoleRepository) {
        this.ecoleRepository = ecoleRepository;
    }

    @Override
    public List<Ecole> getEcoleList() {
        List<Ecole> ecoles;
        ecoles = ecoleRepository.findAll();
        return ecoles;
    }

    @Override
    public Ecole findEcoleById(Integer id) {
        if (id != null)
            return ecoleRepository.getById(id);
        return null;
    }

    @Override
    public Ecole save(Ecole ecole) {
        return ecoleRepository.save(ecole);
    }

    @Override
    public Ecole edit(Ecole ecole) {
        return ecoleRepository.save(ecole);
    }

    @Override
    public void delete(Integer id) {
        ecoleRepository.delete(findEcoleById(id));
    }
}
