package com.nursery.nursery.service;

import com.nursery.nursery.model.Parent;
import com.nursery.nursery.model.Student;
import com.nursery.nursery.repository.ParentJpaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentService {

    @Autowired
    ParentJpaRepository parentJpaRepository;

    public List<Parent> findAllParents(String name){

        List<Parent> parent = new ArrayList<>();

        if(name== null)
            parentJpaRepository.findAll().forEach(parent::add);
        else
            parentJpaRepository.findParentByFirstnamesContaining(name);
        if(!parent.isEmpty())
            return parent;
        else
            System.out.println("No students found");

        return parent;
    }

    public Parent createParent(Parent parent){

        Parent parent1 = parentJpaRepository.save(new Parent());
        return parent1;
    }

}
