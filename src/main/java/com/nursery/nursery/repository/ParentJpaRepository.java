package com.nursery.nursery.repository;

import com.nursery.nursery.model.Parent;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentJpaRepository extends JpaRepository<Parent,Integer> {

    List<Parent> findAll();
    Parent save(Parent parent);
    Parent findParentByFirstnamesContaining(String name);

}
