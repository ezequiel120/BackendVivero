package com.Vivero.GrowingPlants.Service;

import com.Vivero.GrowingPlants.DTO.AdministradorDTO;
import com.Vivero.GrowingPlants.Entity.Administrador;
import com.Vivero.GrowingPlants.Repository.AdministradorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdministradorServiceImpl {

    @Autowired
    AdministradorRepository administradorRepository;

    public AdministradorDTO SaveAdmin(AdministradorDTO administradorDTO) {
        Administrador admin = new Administrador();
        admin.setPassword(admin.getPassword());
        admin.setTelefono(admin.getTelefono());
        admin.setId(admin.getId());
        admin.setCargo(admin.getCargo());
        admin.setEmail(admin.getEmail());
        admin.setNombre(admin.getNombre());
        admin.setApellido(admin.getApellido());
        admin.setCargo(admin.getCargo());
        administradorRepository.save(admin);
        return administradorDTO;
    }

    public void eliminarAdministrador(long id) {
        administradorRepository.deleteById(id);
    }

    public AdministradorDTO modificarAdministrador(AdministradorDTO admin) {
        Administrador objAdmin = new Administrador(admin.getCargo(),admin.getNombre(), admin.getApellido(),admin.getDni(),admin.getPassword(),admin.getTelefono(),admin.getTelefono(),admin.getEmail());
        administradorRepository.save(objAdmin);
        return admin;
    }

    public List<AdministradorDTO> findAllAdministrador(long id) {
        return administradorRepository.findAllById(Collections.singleton(id)).stream().map(admin ->
                new AdministradorDTO(admin.getCargo(), admin.getApellido(), admin.getNombre(), admin.getEmail(), admin.getDni()
                        , admin.getPassword())).collect(Collectors.toList());
    }

}
