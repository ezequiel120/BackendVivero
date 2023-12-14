package com.Vivero.GrowingPlants.Mapper;

import com.Vivero.GrowingPlants.DTO.CategoriaDTO;
import com.Vivero.GrowingPlants.DTO.ClienteDTO;
import com.Vivero.GrowingPlants.Entity.Categoria;
import com.Vivero.GrowingPlants.Entity.Cliente;
import org.mapstruct.factory.Mappers;

import java.util.List;

@org.mapstruct.Mapper(componentModel = "Spring")
public interface ClienteMapper {


    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    ClienteDTO toClienteDTO(ClienteDTO clienteDTO);

    Cliente toCliente(Cliente cliente);

    List<ClienteDTO> toClientesDTO(List<Cliente> clientes);

    List<Cliente> toClientes(List<ClienteDTO> clienteDTOS);
}
