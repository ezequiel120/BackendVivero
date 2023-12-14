package com.Vivero.GrowingPlants.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Persona{

    private String sede;
    public Cliente(long telefono, String nombre, String apellido, String email, long dni, String password, String sede) {
        this.sede=sede;
    }
}
