package com.Vivero.GrowingPlants.DTO;

import jakarta.persistence.Column;
import lombok.*;

@Data
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor

public class PersonaDTO {
    long id;
    String nombre;
    String apellido;
    long dni;
    String password;
    long telefono;
    String email;
}
