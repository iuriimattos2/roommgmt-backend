package de.dlh.lhind.exercise.roommgmt.repository;

import de.dlh.lhind.exercise.roommgmt.model.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BuildingRepository  extends JpaRepository<Building, Long> {

    @Query("from Building b where b.buildingNumber = (:buildingNumber)")
    Optional<Building> findBuildingById(@Param("buildingNumber") String buildingNumber);

    void deleteBuildingById(Long id);
}
