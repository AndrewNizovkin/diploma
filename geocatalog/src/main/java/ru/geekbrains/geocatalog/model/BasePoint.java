package ru.geekbrains.geocatalog.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "points")
@NoArgsConstructor
public class BasePoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Points name
     */
    @Column(name = "name")
    private String name;

    /**
     * The X coordinate of the point in millimeters
     */
    @Column(name = "x")
    private long x;

    /**
     * The Y coordinate of the point in millimeters
     */
    @Column(name = "y")
    private long y;

    /**
     * The Z coordinate of the point in millimeters
     */
    @Column(name = "z")
    private long z;

    /**
     * Nomenclature of a 1:100 000 scale map sheet
     */
    @Column(name = "sheet")
    private String sheet;

    /**
     * The accuracy class of the point
     */
    @Column(name = "type")
    private String pointType;


}