package ru.geekbrains.geocatalog.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AreaDto {

    /**
     * X coordinate of the southwest corner of the search area
     */
    private long x;

    /**
     * Y coordinate of the southwest corner of the search area
     */
    private long y;

    /**
     * Height of the search area
     */
    private long areaHeight;

    /**
     * Width of the search area
     */
    private long areaWidth;


}
