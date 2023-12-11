package com.Vivero.GrowingPlants.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="administrador")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Administrador extends Persona{
    @Column(name = "cargo")
    private String cargo;
}
