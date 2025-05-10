package com.example.lab4_20224926_enriquezsoel.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "paciente")
public class Doctor {


    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "full_name", nullable = false, length = 100)
    private String fullName;

    @Column(name = "dni", nullable = false, length = 8)
    private Integer dni;

    @Column(name = "phone_number", nullable = false, length = 9)
    private String phoneNumber;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "incorporation_date", nullable = false)
    private LocalDate incorporationDate;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private DoctorState doctorState;


}
