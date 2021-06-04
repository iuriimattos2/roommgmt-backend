package de.dlh.lhind.exercise.roommgmt.controller;

import de.dlh.lhind.exercise.roommgmt.model.Room;
import de.dlh.lhind.exercise.roommgmt.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping("/rooms")
    public ResponseEntity<Room> addRoom(@RequestBody Room room) {
        var newRoom = roomService.addRoom(room);
        return new ResponseEntity<>(newRoom, HttpStatus.CREATED);
    }

    @PutMapping("/rooms")
    public ResponseEntity<Room> updateRoom(@RequestBody Room room) {
        var updateRoom = roomService.updateRoom(room);
        return new ResponseEntity<>(updateRoom, HttpStatus.OK);
    }

    @DeleteMapping("/rooms/{id}")
    public ResponseEntity<Room> deleteBuildingById(@PathVariable("id") Long id) {
        roomService.deleteRoomById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/rooms")
    public ResponseEntity<List<Room>> getAllRooms() {
        List<Room> rooms =  roomService.getAllRooms();
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

}
