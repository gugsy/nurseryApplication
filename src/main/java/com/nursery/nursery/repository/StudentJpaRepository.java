package com.nursery.nursery.repository;

import com.nursery.nursery.model.Student;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJpaRepository extends JpaRepository<Student, Integer> {

    Student save(Student student);
    List<Student> findAll();
    Student findStudentByFirstnamesContaining(String name);
}
