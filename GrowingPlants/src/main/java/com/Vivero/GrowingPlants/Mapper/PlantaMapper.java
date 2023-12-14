package com.Vivero.GrowingPlants.Mapper;

import com.Vivero.GrowingPlants.DTO.ClienteDTO;
import com.Vivero.GrowingPlants.DTO.PlantaDTO;
import com.Vivero.GrowingPlants.Entity.Cliente;
import com.Vivero.GrowingPlants.Entity.Planta;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface PlantaMapper {

    PlantaMapper INSTANCE = Mappers.getMapper(PlantaMapper.class);

    PlantaDTO toPlantaDTO(PlantaDTO plantaDTO);

    Planta toPlanta(Planta planta);

    List<PlantaDTO> toPlantasDTO(List<Planta> plantas);

    List<Planta> toPlantas(List<PlantaDTO> plantaDTOS);
}
