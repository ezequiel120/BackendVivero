package com.Vivero.GrowingPlants.Mapper;

import com.Vivero.GrowingPlants.DTO.AdministradorDTO;
import com.Vivero.GrowingPlants.Entity.Administrador;
import org.mapstruct.factory.Mappers;

import java.util.List;
@org.mapstruct.Mapper(componentModel="Spring")
public interface AdministradorMapper {

    AdministradorMapper INSTANCE = Mappers.getMapper(AdministradorMapper.class);
    AdministradorDTO toAdministradorDTO (AdministradorDTO administradorDTO);
    Administrador toAdministrador (Administrador administrador);

    List<AdministradorDTO> toAdministradorsDTO(List<Administrador> administradors);
    List<Administrador> toAdministradors (List<AdministradorDTO> administradorDTOS);
}
