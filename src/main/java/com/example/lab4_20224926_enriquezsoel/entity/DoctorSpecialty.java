package com.example.lab4_20224926_enriquezsoel.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "doctor_specialty")
public class DoctorSpecialty {

    @EmbeddedId
    private DoctorSpecialtyId id;

    @ManyToOne
    @MapsId("doctorId")
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @MapsId("specialtyId")
    @JoinColumn(name = "specialty_id")
    private Specialty specialty;
}
