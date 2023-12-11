package com.Vivero.GrowingPlants.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Persona {
    @Id
    @GeneratedValue
    private long id;
    private  String nombre;
    private String apellido;
    private long dni;
    private String password;
    @Column (name = "telefono")
    private  long telefono;
    @Column (name = "email")
    private  String email;


}
