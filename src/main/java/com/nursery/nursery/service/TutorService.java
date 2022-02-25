package com.nursery.nursery.service;

import com.nursery.nursery.model.Tutor;
import com.nursery.nursery.repository.TutorJpaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TutorService {

    @Autowired
    TutorJpaRepository tutorJpaRepository;


    public List<Tutor> findAllTutors(String employmentNumber){

        List<Tutor> tutor = new ArrayList<>();

        if(employmentNumber== null)
            tutorJpaRepository.findAll().forEach(tutor::add);
        else
            tutorJpaRepository.findTutorByEmploymentNumberContaining(employmentNumber);
        if(!tutor.isEmpty())
            return tutor;
        else
            System.out.println("No students found");

        return tutor;
    }

    public Tutor createTutor(Tutor tutor){

        Tutor tutor1 = tutorJpaRepository.save(new Tutor());
        return tutor1;
    }



}
