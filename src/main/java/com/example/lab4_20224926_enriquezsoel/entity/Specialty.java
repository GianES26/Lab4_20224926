package com.example.lab4_20224926_enriquezsoel.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "specialty")
public class Specialty {


    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 70)
    private String name;

    @Column(name = "code", nullable = false, length = 6, unique = true)
    private Integer code;


}
