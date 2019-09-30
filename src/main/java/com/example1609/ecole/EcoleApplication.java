package com.example1609.ecole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcoleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcoleApplication.class, args);
        /*ApplicationContext ctx = SpringApplication.run(EcoleApplication.class, args);

        CandidatRepository candidatRepository = ctx.getBean(CandidatRepository.class);
        //candidatRepository.save(new Candidat("Candidat01"));

        SkillsRepository skillsRepository = ctx.getBean(SkillsRepository.class);
        //skillsRepository.save(new Skills("skills01"));

        CandidatSkillsRepository candidatSkillsRepository = ctx.getBean(CandidatSkillsRepository.class);
        //candidatSkillsRepository.save(new CandidatSkills(new CandidatSkillsId(1, 2)));

        TesteRepository testeRepository = ctx.getBean(TesteRepository.class);
        //testeRepository.save(new Teste("Teste01"));

        TesteCandidatSkillsRepository testeCandidatSkillsRepository = ctx.getBean(TesteCandidatSkillsRepository.class);
        testeCandidatSkillsRepository.save(new TesteCandidatSkills(new TesteCandidatSkillsId(3, new CandidatSkillsId(1,2))));*/


    }

}
