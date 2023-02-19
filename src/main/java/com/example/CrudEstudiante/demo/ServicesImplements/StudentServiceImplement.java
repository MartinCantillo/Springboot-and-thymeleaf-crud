/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CrudEstudiante.demo.ServicesImplements;

import com.example.CrudEstudiante.demo.EstudianteDao.EstudianteDao;
import com.example.CrudEstudiante.demo.Model.Estudiante;
import com.example.CrudEstudiante.demo.Services.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marti
 */
@Service
public class StudentServiceImplement implements StudentService {

    @Autowired
    private EstudianteDao estudiantedao;

    @Override
    public List<Estudiante> listarEstudiantes() {
        return (List<Estudiante>) estudiantedao.findAll();
    }

    @Override
    public void guardar(Estudiante Estudiante) {
        estudiantedao.save(Estudiante);
    }

    @Override
    public void eliminar(Estudiante Estudiante) {
        estudiantedao.delete(Estudiante);
    }

    @Override
    public Estudiante encontrarcliente(Estudiante Estudiante) {
        return estudiantedao.findById(Estudiante.getCodigo()).orElse(null);
    }

}
