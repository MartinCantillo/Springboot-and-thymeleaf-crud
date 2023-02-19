/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CrudEstudiante.demo.Model;

import jakarta.persistence.*;
import lombok.*;

/**
 *
 * @author marti
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long codigo;
    String nombre;
    String apellido;
    String programa;

   
}
