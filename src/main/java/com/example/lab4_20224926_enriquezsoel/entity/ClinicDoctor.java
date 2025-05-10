package com.example.lab4_20224926_enriquezsoel.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clinic_doctor")
public class ClinicDoctor {

    @EmbeddedId
    private ClinicDoctorId id;

    @ManyToOne
    @MapsId("clinicId")
    @JoinColumn(name = "clinic_id")
    private Clinic clinic;

    @ManyToOne
    @MapsId("doctorId")
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
}

