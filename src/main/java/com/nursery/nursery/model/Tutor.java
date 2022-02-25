package com.nursery.nursery.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tutor {

    @Id
    private String employmentNumber;
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


}
