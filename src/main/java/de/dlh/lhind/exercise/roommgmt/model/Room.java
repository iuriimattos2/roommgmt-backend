package de.dlh.lhind.exercise.roommgmt.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Building building;

    @Basic(optional = false)
    @Column(unique = true)
    @NotNull
    private String roomNumber;

    @Basic(optional = false)
    @Size(min = 1, max = 9999, message = "Amount of seats must be between 1 and 9999")
    private Integer seats;

    @Basic(optional = false)
    private Boolean projectorPresent;

    public Room(Building building,
                @NotNull String roomNumber,
                @Size(min = 1, max = 9999, message = "Amount of seats must be between 1 and 9999") Integer seats,
                Boolean projectorPresent) {
        this.building = building;
        this.roomNumber = roomNumber;
        this.seats = seats;
        this.projectorPresent = projectorPresent;
    }

}
