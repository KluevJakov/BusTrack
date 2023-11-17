package ru.aptech.bustrack.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@SuppressWarnings("unused")
@Getter
@Setter
@Entity
@Table(name = "transport_type")
public class TransportType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "type")
    private String type;

}