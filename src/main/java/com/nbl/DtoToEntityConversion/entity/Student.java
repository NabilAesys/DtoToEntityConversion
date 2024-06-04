package com.nbl.DtoToEntityConversion.entity;


import java.util.Date;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate = new Date();


    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate = new Date();

    private String name;

    private String username;

    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
}
