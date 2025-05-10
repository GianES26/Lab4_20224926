package com.example.lab4_20224926_enriquezsoel.repository;

import com.example.lab4_20224926_enriquezsoel.entity.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicsRepository extends JpaRepository<Clinic, Integer> {

    // Buscar establecimiento por su ID
    //Clinic findById(Integer establecimientoDeportivoId);


}