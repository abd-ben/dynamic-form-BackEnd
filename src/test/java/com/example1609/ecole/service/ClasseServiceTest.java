package com.example1609.ecole.service;

import com.example1609.ecole.repo.ClasseRepository;
import com.example1609.ecole.service.impl.ClasseServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ClasseServiceTest {

    @InjectMocks
    private ClasseServiceImpl underTest;

    @Mock
    private ClasseRepository classeRepository;

    @Test
    public void shoud_test_Service(){
        assertEquals(classeRepository.getById(3), underTest.findClasseById(3));
    }
}