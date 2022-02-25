package com.nursery.nursery.service;

import com.nursery.nursery.model.Student;
import com.nursery.nursery.repository.StudentJpaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentJpaRepository studentJpaRepository;


    public List<Student> findAllStudents(String name){

        List<Student> student = new ArrayList<>();

        if(name== null)
        studentJpaRepository.findAll().forEach(student::add);
        else
            studentJpaRepository.findStudentByFirstnamesContaining(name);
        if(!student.isEmpty())
            return student;
        else
            System.out.println("No students found");

        return student;
    }

    public Student createStudent(Student student){

        Student student1 = studentJpaRepository.save(new Student(student.getFirstnames(),student.getSurname(),student.getAddress(),student.getDateOfBirth(),student.getGender(),student.getMobileNumber()));
        return student1;
     }
}
