package ru.geekbrains.geocatalog.mapper;

import ru.geekbrains.geocatalog.dto.BasePointDto;
import ru.geekbrains.geocatalog.model.BasePoint;

import java.util.List;

public class BasePointMapper {

    /**
     * Converts BasePointDto instance to BasePoint instance
     * @param basePointDto BasePointDto instance
     * @return BasePoint instance
     */
    public static BasePoint toBasePoint(BasePointDto basePointDto) {

        BasePoint basePoint = new BasePoint();

        basePoint.setName(basePointDto.getName());
        basePoint.setX(basePointDto.getX());
        basePoint.setY(basePointDto.getY());
        basePoint.setZ(basePointDto.getZ());
        basePoint.setSheet(basePointDto.getSheet());
        basePoint.setPointType(basePointDto.getPointType());
        basePoint.setCoordinateSystem(basePointDto.getCoordinateSystem());

        return basePoint;
    }

    /**
     * Converts BasePoint instance to BasePointDto instance
     * @param basePoint BasePointDto instance
     * @return BasePointDto instance
     */
    public static BasePointDto toBasePointDto(BasePoint basePoint) {

        BasePointDto basePointDto = new BasePointDto();

        basePointDto.setId(basePoint.getId());
        basePointDto.setName(basePoint.getName());
        basePointDto.setX(basePoint.getX());
        basePointDto.setY(basePoint.getY());
        basePointDto.setZ(basePoint.getZ());
        basePointDto.setSheet(basePoint.getSheet());
        basePointDto.setPointType(basePoint.getPointType());
        basePointDto.setCoordinateSystem(basePoint.getCoordinateSystem());

        return basePointDto;
    }

    /**
     * Converts BasePoint instance list to BasePointDto instance list
     * @param basePoints BasePointDto instance list
     * @return BasePointDto instance list
     */
    public static List<BasePointDto> toListBasePointDto(List<BasePoint> basePoints) {
        return basePoints.stream().map(BasePointMapper::toBasePointDto).toList();
    }

    /**
     * Converts BasePointDto instance list to BasePoint instance list
     * @param basePointsDto BasePointDto instance list
     * @return BasePoint instance list
     */
    public static List<BasePoint> toListBasePoint(List<BasePointDto> basePointsDto) {
        return basePointsDto.stream().map(BasePointMapper::toBasePoint).toList();
    }

}
