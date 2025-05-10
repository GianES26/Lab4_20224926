package com.example.lab4_20224926_enriquezsoel.controller;


import com.example.lab4_20224926_enriquezsoel.entity.Clinic;
import com.example.lab4_20224926_enriquezsoel.repository.ClinicsRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;


@Controller
public class clinicsController {

    @Autowired
    private ClinicsRepository clinicsRepository;


    @GetMapping("")
    public String inicio(Model model) {
        //List<Doctor> doctores = doctorRepository.findAll();

        //model.addAttribute("listaDoctores", doctores);
        return "inicio";
    }

    //ClinicsRepository


    @GetMapping("clinicas")
    public String listarEstablecimientos(Model model) {
        List<Clinic> clinicList = clinicsRepository.findAll();

        model.addAttribute("clinicList", clinicList);
        return "clinicList";
    }

    @GetMapping("clinicas/nuevo")
    public String crearClinica(@ModelAttribute("clinica") Clinic clinica, Model model) {
        return "clinicasCrearForm";
    }



    @GetMapping("clinicas/editar")
    public String editarClinica(@ModelAttribute("clinica") Clinic clinica, @RequestParam("id") Integer id, Model model) {

        //Optional<Clinic> optClinica = ClinicsRepository.findById(id);

        Optional<Clinic> optClinica = clinicsRepository.findById(id);


        if(optClinica.isPresent()) {

            clinica = optClinica.get();
            model.addAttribute("clinica", clinica);
            return "clinicasCrearForm";

        }

        else {
            return "redirect:/clinicas";
        }
    }

    /*
    @PostMapping("clinicas/guardar")
    public String guardarClinica(@ModelAttribute("clinica") @Valid Clinic clinica, BindingResult bindingResult, RedirectAttributes attr) {
        // Lógica para guardar el establecimiento en la base de datos

        if (bindingResult.hasErrors()) {
            return "clinicasCrearForm";

        }

        else {
            if (clinica.f() == null || establecimiento.getEstablecimientoDeportivoId() == 0) {
                attr.addFlashAttribute("msg", "Establecimiento creado satisfactoriamente Owo");
            }

            else {
                attr.addFlashAttribute("msg", "Establecimiento editado satisfactoriamente :D");
            }
            establecimientoDeportivoRepository.save(establecimiento);
            return "redirect:/admin/establecimientos"; // Redirige a la lista de establecimientos
        }

    }*/

    @PostMapping("/clinicas/guardar")
    public String guardarClinica(@ModelAttribute("clinica") @Valid Clinic clinica,
                                 BindingResult bindingResult,
                                 RedirectAttributes attr) {
        if (bindingResult.hasErrors()) {
            return "clinicasCrearForm";
        } else {
            boolean esNueva = (clinica.getId() == null || !clinicsRepository.existsById(clinica.getId()));
            clinicsRepository.save(clinica);
            if (esNueva) {
                attr.addFlashAttribute("msg", "Clínica creada satisfactoriamente");
            } else {
                attr.addFlashAttribute("msg", "Clínica editada satisfactoriamente");
            }
            return "redirect:/clinicas";
        }
    }



}
