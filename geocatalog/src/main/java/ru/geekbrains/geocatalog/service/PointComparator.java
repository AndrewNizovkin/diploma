package ru.geekbrains.geocatalog.service;

import org.springframework.stereotype.Component;
import ru.geekbrains.geocatalog.dto.BasePointDto;
import ru.geekbrains.geocatalog.model.BasePoint;

@Component
public class PointComparator {

    /**
     * Compare fields of BasePoint instance with fields of BasePointDto instance
     * @param basePoint BasePoint instance
     * @param basePointDto BasePointDto instance
     * @return boolean result
     */
    public boolean compareBasePointBasePointDTO(BasePoint basePoint, BasePointDto basePointDto) {
        return basePoint.getId() == basePointDto.getId() &&
                basePoint.getName().equals(basePointDto.getName()) &&
                basePoint.getX() == basePointDto.getX() &&
                basePoint.getY() == basePointDto.getY() &&
                basePoint.getZ() == basePointDto.getZ() &&
                basePoint.getSheet().equals(basePointDto.getSheet()) &&
                basePoint.getAccuracyClass().equals(basePointDto.getAccuracyClass()) &&
                basePoint.getCoordinateSystem().equals(basePointDto.getCoordinateSystem());
    }

    /**
     * Compare fields of BasePointDto instance with fields of BasePoint instance
     * @param basePointDto BasePointDto instance
     * @param basePoint BasePoint instance
     * @return boolean result
     */
    public boolean compareBasePointDtoBasePoint(BasePointDto basePointDto, BasePoint basePoint) {
        return basePointDto.getName().equals(basePoint.getName()) &&
                basePointDto.getX() == basePoint.getX() &&
                basePointDto.getY() == basePoint.getY() &&
                basePointDto.getZ() == basePoint.getZ() &&
                basePointDto.getSheet().equals(basePoint.getSheet()) &&
                basePointDto.getAccuracyClass().equals(basePoint.getAccuracyClass()) &&
                basePointDto.getCoordinateSystem().equals(basePoint.getCoordinateSystem());
    }

    /**
     * Compare fields of BasePointDto instance with fields of BasePointDto instance
     * @param expectPoint BasePointDto instance
     * @param actualPoint BasePointDto instance
     * @return boolean result
     */
    public boolean compareBasePointDtoBasePointDto(BasePointDto expectPoint, BasePointDto actualPoint) {
        return expectPoint.getName().equals(actualPoint.getName()) &&
                expectPoint.getX() == actualPoint.getX() &&
                expectPoint.getY() == actualPoint.getY() &&
                expectPoint.getZ() == actualPoint.getZ() &&
                expectPoint.getSheet().equals(actualPoint.getSheet()) &&
                expectPoint.getAccuracyClass().equals(actualPoint.getAccuracyClass()) &&
                expectPoint.getCoordinateSystem().equals(actualPoint.getCoordinateSystem());
    }
}
