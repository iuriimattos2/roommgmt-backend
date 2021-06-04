package de.dlh.lhind.exercise.roommgmt.controller;

import de.dlh.lhind.exercise.roommgmt.model.Building;
import de.dlh.lhind.exercise.roommgmt.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuildingController {

    private final BuildingService buildingService;

    @Autowired
    public BuildingController(BuildingService buildingService) {
        this.buildingService = buildingService;
    }

    @GetMapping("/buildings")
    public ResponseEntity<List<Building>> getAllBuildings() {
        List<Building> buildings =  buildingService.getAllBuildings();
        return new ResponseEntity<>(buildings, HttpStatus.OK);
    }

    @GetMapping("/buildings/{buildingNumber}")
    public ResponseEntity<Building> findBuildingById(@PathVariable("buildingNumber") String buildingNumber) {
        var building =  buildingService.findBuildingById(buildingNumber);
        return new ResponseEntity<>(building, HttpStatus.OK);
    }

    @PostMapping("/buildings")
    public ResponseEntity<Building> addBuilding(@RequestBody Building building) {
        var newBuilding = buildingService.addBuilding(building);
        return new ResponseEntity<>(newBuilding, HttpStatus.CREATED);
    }

    @PutMapping("/buildings")
    public ResponseEntity<Building> updateBuilding(@RequestBody Building building) {
        var updateEmployee = buildingService.updateBuilding(building);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/buildings/{id}")
    public ResponseEntity<Building> deleteBuildingById(@PathVariable("id") Long id) {
        buildingService.deleteBuildingById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
