/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CrudEstudiante.demo.Controller;

import com.example.CrudEstudiante.demo.Model.Estudiante;
import com.example.CrudEstudiante.demo.ServicesImplements.StudentServiceImplement;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author marti
 */
@Controller
@Slf4j // para usar el log
public class Controlador {

    @Autowired
    private StudentServiceImplement studentserviceimp;

    @GetMapping("/estudiantes")
    public String getAllEstudents(Model modelo) {

        modelo.addAttribute("estudiantes", studentserviceimp.listarEstudiantes());
        return "listar";

    }

    @GetMapping("/agregar")
    public String addCustomer(Estudiante Estudiante) {

        return "modificar";

    }

    @PostMapping("/guardar")
    public String saveCustomer(Estudiante Estudiante) {

        studentserviceimp.guardar(Estudiante);
        return "redirect:/estudiantes";

    }

    @GetMapping("/eliminar/{codigo}")
    public String deleteCustomer(Estudiante Estudiante) {
        studentserviceimp.eliminar(Estudiante);

        return "redirect:/estudiantes";

    }

    @GetMapping("/editar/{codigo}")
    public String Update(Estudiante Estudiante, Model Model) {

        Estudiante = studentserviceimp.encontrarcliente(Estudiante);
        Model.addAttribute("estudiante", Estudiante);
        return "modificar";

    }
}
