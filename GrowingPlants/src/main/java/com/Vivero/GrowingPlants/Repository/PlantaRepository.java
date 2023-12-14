package com.Vivero.GrowingPlants.Repository;

import com.Vivero.GrowingPlants.Entity.Planta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantaRepository extends JpaRepository<Planta,Long> {
}
