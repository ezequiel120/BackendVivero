package com.Vivero.GrowingPlants.Mapper;

import com.Vivero.GrowingPlants.DTO.CategoriaDTO;
import com.Vivero.GrowingPlants.Entity.Categoria;
import org.mapstruct.factory.Mappers;

import java.util.List;

@org.mapstruct.Mapper(componentModel = "Spring")
public interface CategoriaMapper {
    CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    CategoriaDTO toCategoriaDTO(CategoriaDTO categoriaDTO);

    Categoria toCategoria(Categoria categoria);

    List<CategoriaDTO> toCategoriasDTO(List<Categoria> categorias);

    List<Categoria> toCategorias(List<CategoriaDTO> categoriaDTOS);

}
