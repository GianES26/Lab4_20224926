package com.example.lab4_20224926_enriquezsoel.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "clinic")
public class Clinic {


    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "address", nullable = false, length = 150)
    private String address;

    @Column(name = "phone_number", nullable = false, length = 9)
    private String phoneNumber;


}
