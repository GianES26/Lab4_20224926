package com.example.lab4_20224926_enriquezsoel.entity;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class DoctorSpecialtyId implements Serializable {
    private Integer doctorId;
    private Integer specialtyId;
}
