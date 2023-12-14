package com.Vivero.GrowingPlants.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class ImagenDTO {
    int id;
    String name;
    String imagenUrl;
    String imagenId;
}
