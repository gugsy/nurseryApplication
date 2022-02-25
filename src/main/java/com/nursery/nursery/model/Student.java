package com.nursery.nursery.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String firstnames;
    @Column
    private String surname;
    @Column
    private String address;
    @Column
    private Date dateOfBirth;
    @Column
    private String gender;
    @Column
    private int mobileNumber;

    public Student(String firstnames,
                   String surname,
                   String address,
                   Date dateOfBirth,
                   String gender,
                   int mobileNumber) {
    }

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;
}
