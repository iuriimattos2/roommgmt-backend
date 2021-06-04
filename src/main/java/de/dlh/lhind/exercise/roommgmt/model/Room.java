package de.dlh.lhind.exercise.roommgmt.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity(name = "Room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(optional =false, fetch=FetchType.EAGER)
    private Building building;

    @Basic(optional = false)
    @Column(unique = true)
    private String roomNumber;

    @Basic(optional = false)
    @Size(min = 1, max = 9999)
    private Integer seats;

    @Basic(optional = false)
    private Boolean projectorPresent;

    public Room(Building building, String roomNumber, Integer seats, Boolean projectorPresent) {
        this.building = building;
        this.roomNumber = roomNumber;
        this.seats = seats;
        this.projectorPresent = projectorPresent;
    }

}
