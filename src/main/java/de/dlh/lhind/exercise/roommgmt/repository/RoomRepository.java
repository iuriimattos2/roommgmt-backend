package de.dlh.lhind.exercise.roommgmt.repository;

import de.dlh.lhind.exercise.roommgmt.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {

    @Query("from Room r where r.roomNumber = (:roomNumber)")
    Optional<Room> getRoomById(@Param("roomNumber") String roomNumber);

    void deleteRoomById(Long id);

}
