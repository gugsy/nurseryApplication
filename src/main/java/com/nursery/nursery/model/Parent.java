package com.nursery.nursery.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String firstnames;
    @Column
    private String surname;
    @Column
    private String gender;
    @Column
    private Date dateOfBirth;
    @Column
    private String address;
    @Column
    private int mobileNumber;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String employmentNumber;

    @OneToMany(mappedBy = "parent")
    private List<Student> students;



}
