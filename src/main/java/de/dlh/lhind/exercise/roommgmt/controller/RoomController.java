package de.dlh.lhind.exercise.roommgmt.controller;

import de.dlh.lhind.exercise.roommgmt.model.Room;
import de.dlh.lhind.exercise.roommgmt.service.RoomService;
import io.swagger.annotations.ApiOperation;
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
    public ResponseEntity<Room> deleteRoomById(@PathVariable("id") Long id) {
        roomService.deleteRoomById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "Retrieves all rooms",
            notes = "A list of rooms",
            response = Room.class,
            responseContainer = "List",
            produces = "application/json")
    @GetMapping("/rooms")
    public ResponseEntity<List<Room>> getAllRooms() {
        List<Room> rooms =  roomService.getAllRooms();
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    @GetMapping("/rooms/{roomNumber}")
    public ResponseEntity<Room> getRoomById(@PathVariable("roomNumber") String roomNumber) {
        var room =  roomService.getRoomById(roomNumber);
        return new ResponseEntity<>(room, HttpStatus.OK);
    }

}
