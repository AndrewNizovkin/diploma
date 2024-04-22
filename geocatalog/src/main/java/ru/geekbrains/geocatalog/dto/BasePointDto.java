package ru.geekbrains.geocatalog.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class BasePointDto {

    private long id;

    /**
     * Points name
     */
    private String name;

    /**
     * The X coordinate of the point in millimeters
     */
    private long x;

    /**
     * The Y coordinate of the point in millimeters
     */
    private long y;

    /**
     * The Z coordinate of the point in millimeters
     */
    private long z;

    /**
     * Nomenclature of a 1:100 000 scale map sheet
     */
    private String sheet;

    /**
     * The accuracy class of the point
     */
    private String pointType;

    /**
     * The coordinate system
     */
    private String coordinateSystem;


}
