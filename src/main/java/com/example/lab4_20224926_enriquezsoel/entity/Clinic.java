package com.example.lab4_20224926_enriquezsoel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clinic")
public class Clinic {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotBlank(message = "El nombre de la clínica es obligatorio")
    @Size(min = 5, max = 100, message = "El nombre de la clínica debe tener entre 5 y 100 caracteres")
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @NotBlank(message = "La dirección es obligatoria")
    @Size(min = 10, message = "La dirección debe tener al menos 10 caracteres")
    @Column(name = "address", nullable = false, length = 150)
    private String address;

    @NotBlank(message = "El número de teléfono es obligatorio")
    @Column(name = "phone_number", nullable = false, length = 9)
    private String phoneNumber;
}
