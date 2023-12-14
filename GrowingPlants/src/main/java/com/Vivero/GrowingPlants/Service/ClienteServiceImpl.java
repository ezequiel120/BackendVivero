package com.Vivero.GrowingPlants.Service;

import com.Vivero.GrowingPlants.DTO.ClienteDTO;
import com.Vivero.GrowingPlants.Entity.Cliente;
import com.Vivero.GrowingPlants.Repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServiceImpl {
    @Autowired
    ClienteRepository clienteRepository;

    @Transactional
    public ClienteDTO guardarCliente(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();

        cliente.setId(clienteDTO.getId());
        cliente.setSede(clienteDTO.getSede());
        cliente.setApellido(clienteDTO.getApellido());
        cliente.setNombre(clienteDTO.getNombre());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setPassword(clienteDTO.getPassword());
        cliente.setDni(clienteDTO.getDni());
        cliente.setTelefono(clienteDTO.getTelefono());
        clienteRepository.save(cliente);
        return clienteDTO;
    }

    public void eliminarCliente(long id) {
        clienteRepository.deleteById(id);
    }

    public ClienteDTO modificarCliente(ClienteDTO cliente) {
        Cliente objCliente = new Cliente(cliente.getTelefono(), cliente.getNombre(), cliente.getApellido(), cliente.getEmail(), cliente.getDni(),
                cliente.getPassword(), cliente.getSede());
        clienteRepository.save(objCliente);
        return cliente;
    }

    public List<ClienteDTO> findAllCliente(String nombre) {
        return clienteRepository.findBynombreContaining(nombre).stream().map(cliente ->
                        new ClienteDTO(cliente.getTelefono(), cliente.getNombre(), cliente.getApellido(), cliente.getEmail(), cliente.getDni(),
                                cliente.getPassword(),cliente.getSede())).
                collect(Collectors.toList());
    }
}
