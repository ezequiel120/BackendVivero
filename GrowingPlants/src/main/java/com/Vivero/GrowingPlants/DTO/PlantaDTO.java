package com.Vivero.GrowingPlants.DTO;

import jakarta.persistence.Column;
import lombok.*;

@Data
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class PlantaDTO {

    long id;
    String nombre;
    int precio;
    String tipo;
    String categoria;
    String descripcion;

    ImagenDTO imagen;
}
