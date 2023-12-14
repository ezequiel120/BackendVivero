package com.Vivero.GrowingPlants.Repository;

import com.Vivero.GrowingPlants.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    public List<Cliente> findBynombreContaining(String nombre);
}
