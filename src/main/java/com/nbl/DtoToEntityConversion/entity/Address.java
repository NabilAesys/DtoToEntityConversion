package com.nbl.DtoToEntityConversion.entity;



import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
}
