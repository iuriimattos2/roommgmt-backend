package de.dlh.lhind.exercise.roommgmt.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity(name = "Meeting")
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @NotNull
    private Room room;

    @Basic(optional = false)
    private String topic;

    @Basic(optional = false)
    private Instant start;

    @Basic(optional = false)
    private Instant end;

    public Meeting(@NotNull Room room, String topic, Instant start, Instant end) {
        this.room = room;
        this.topic = topic;
        this.start = start;
        this.end = end;
    }

}
