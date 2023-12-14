package com.Vivero.GrowingPlants.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor

public class AdministradorDTO extends PersonaDTO{
    String cargo;


    public AdministradorDTO(String cargo, String apellido, String nombre, String email, long dni, String password) {
    }
}
