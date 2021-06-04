package de.dlh.lhind.exercise.roommgmt.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity(name = "Building")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Basic(optional = false)
    @Column(unique = true)
    private String buildingNumber;

    private String description;

    @Basic(optional = false)
    private Boolean publicAccess;

    public Building(String buildingNumber, String description, Boolean publicAccess) {
        this.buildingNumber = buildingNumber;
        this.description = description;
        this.publicAccess = publicAccess;
    }

}
