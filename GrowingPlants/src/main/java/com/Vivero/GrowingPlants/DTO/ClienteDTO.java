package com.Vivero.GrowingPlants.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDTO  extends PersonaDTO{
    String sede;


    public ClienteDTO(long telefono, String nombre, String apellido, String email, long dni, String password, String sede) {
        this.sede = sede;
    }
}
