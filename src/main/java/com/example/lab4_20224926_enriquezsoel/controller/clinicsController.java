package com.example.lab4_20224926_enriquezsoel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class clinicsController {

    /*@Autowired
    private pacienteRepository pacienteRepository;

    @Autowired
    private doctorRepository doctorRepository;

    @Autowired
    private hospitalRepository hospitalRepository;*/


    @GetMapping("")
    public String inicio(Model model) {
        //List<Doctor> doctores = doctorRepository.findAll();

        //model.addAttribute("listaDoctores", doctores);
        return "inicio";
    }




}
