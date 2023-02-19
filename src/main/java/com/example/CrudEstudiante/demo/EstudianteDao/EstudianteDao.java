/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.CrudEstudiante.demo.EstudianteDao;

import com.example.CrudEstudiante.demo.Model.Estudiante;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author marti
 */
public interface EstudianteDao extends CrudRepository<Estudiante, Long>  {
    
}
