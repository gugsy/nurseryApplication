package com.nursery.nursery.repository;

import com.nursery.nursery.model.Tutor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorJpaRepository extends JpaRepository<Tutor,String> {

    Tutor save(Tutor t);
    List<Tutor>findAll();
    Tutor findTutorByEmploymentNumberContaining(String pattern);

}
