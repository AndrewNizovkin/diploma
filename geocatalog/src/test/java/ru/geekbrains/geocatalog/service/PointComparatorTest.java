package ru.geekbrains.geocatalog.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import ru.geekbrains.geocatalog.dto.BasePointDto;
import ru.geekbrains.geocatalog.model.BasePoint;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {
        PointComparator.class
})
class PointComparatorTest {

    @Autowired
    private PointComparator pointComparator;

    private BasePoint basePoint;

    private BasePointDto basePointDto;

    @BeforeEach
    public void setUp() {
        basePoint = new BasePoint(
                "Горная",
                5212365400L,
                7575821450L,
                1159780L,
                "L-37-09",
                "3кл",
                "1942г"
        );

        basePointDto = new BasePointDto();
        basePointDto.setId(basePoint.getId());
        basePointDto.setName(basePoint.getName());
        basePointDto.setX(basePoint.getX());
        basePointDto.setY(basePoint.getY());
        basePointDto.setZ(basePoint.getZ());
        basePointDto.setSheet(basePoint.getSheet());
        basePointDto.setAccuracyClass(basePoint.getAccuracyClass());
        basePointDto.setCoordinateSystem(basePoint.getCoordinateSystem());


    }

    @Test
    void compareBasePointBasePointDTOTest() {
        assertTrue(pointComparator.compareBasePointBasePointDTO(
                basePoint, basePointDto));
    }

    @Test
    void compareBasePointDtoBasePoint() {
        assertTrue(pointComparator.compareBasePointDtoBasePointDto(
                basePointDto, basePointDto
        ));
    }

    @Test
    void compareBasePointDtoBasePointDto() {
        assertTrue(pointComparator.compareBasePointDtoBasePoint(
                basePointDto, basePoint
        ));
    }
}