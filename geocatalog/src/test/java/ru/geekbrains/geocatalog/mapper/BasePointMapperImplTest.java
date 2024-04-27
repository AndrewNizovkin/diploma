package ru.geekbrains.geocatalog.mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import ru.geekbrains.geocatalog.dto.BasePointDto;
import ru.geekbrains.geocatalog.model.BasePoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ActiveProfiles("test")
class BasePointMapperImplTest {

    Random random = new Random();

    @Autowired
    BasePointMapper basePointMapper;

    @Test
    void toBasePointTest() {
        BasePointDto expectBasePointDto = new BasePointDto();
        expectBasePointDto.setName("1001");
        expectBasePointDto.setX(999999999999L);
        expectBasePointDto.setY(888888888888L);
        expectBasePointDto.setZ(9000000000L);
        expectBasePointDto.setSheet("L-37-32");
        expectBasePointDto.setAccuracyClass("2кл");
        expectBasePointDto.setCoordinateSystem("МСК-61-2");

        BasePoint actualBasePoint = basePointMapper.toBasePoint(expectBasePointDto);

        Assertions.assertNotNull(actualBasePoint);
        Assertions.assertEquals(expectBasePointDto.getName(), actualBasePoint.getName());
        Assertions.assertEquals(expectBasePointDto.getX(), actualBasePoint.getX());
        Assertions.assertEquals(expectBasePointDto.getY(), actualBasePoint.getY());
        Assertions.assertEquals(expectBasePointDto.getZ(), actualBasePoint.getZ());
        Assertions.assertEquals(expectBasePointDto.getSheet(), actualBasePoint.getSheet());
        Assertions.assertEquals(expectBasePointDto.getAccuracyClass(), actualBasePoint.getAccuracyClass());
        Assertions.assertEquals(expectBasePointDto.getCoordinateSystem(), actualBasePoint.getCoordinateSystem());

    }

    @Test
    void toBasePointDtoTest() {
        BasePoint expectBasePoint = new BasePoint(
                "Горная",
                5212365400L,
                7575821450L,
                1159780L,
                "L-37-09",
                "3кл",
                "1942г"
        );

        BasePointDto actualBasePointDto = basePointMapper.toBasePointDto(expectBasePoint);

        Assertions.assertNotNull(actualBasePointDto);
        Assertions.assertEquals(expectBasePoint.getId(), actualBasePointDto.getId());
        Assertions.assertEquals(expectBasePoint.getName(), actualBasePointDto.getName());
        Assertions.assertEquals(expectBasePoint.getX(), actualBasePointDto.getX());
        Assertions.assertEquals(expectBasePoint.getY(), actualBasePointDto.getY());
        Assertions.assertEquals(expectBasePoint.getZ(), actualBasePointDto.getZ());
        Assertions.assertEquals(expectBasePoint.getSheet(), actualBasePointDto.getSheet());
        Assertions.assertEquals(expectBasePoint.getAccuracyClass(), actualBasePointDto.getAccuracyClass());
        Assertions.assertEquals(expectBasePoint.getCoordinateSystem(), actualBasePointDto.getCoordinateSystem());
    }

    @Test
    void toListBasePointDtoTest() {
//        List<BasePointDto> expectBasePointDtoList = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            BasePointDto basePointDto = new BasePointDto();
//            basePointDto.setName("Point_N_" + random.nextInt(100));
//            basePointDto.setX(random.nextLong(1000000000));
//            basePointDto.setY(random.nextLong(1000000000));
//            basePointDto.setZ(random.nextLong(1000000));
//            basePointDto.setSheet("L-37-" + random.nextInt(144));
//            basePointDto.setAccuracyClass(random.nextInt(4) + "кл");
//            basePointDto.setCoordinateSystem(String.valueOf(random.nextInt(10000)));
//            expectBasePointDtoList.add(basePointDto);
//        }
//
//        List<BasePoint> actualBasePointList = basePointMapper.toListBasePoint(expectBasePointDtoList);
//
//        Assertions.assertNotNull(actualBasePointList);
//        Assertions.assertEquals(expectBasePointDtoList.size(), actualBasePointList.size());
//        for (int i = 0; i < expectBasePointDtoList.size(); i++) {
//            Assertions.assertEquals();
//        }
    }

    @Test
    void toListBasePointTest() {
        List<BasePointDto> expectBasePointDtoList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            BasePointDto basePointDto = new BasePointDto();
            basePointDto.setName("Point_N_" + random.nextInt(100));
            basePointDto.setX(random.nextLong(1000000000));
            basePointDto.setY(random.nextLong(1000000000));
            basePointDto.setZ(random.nextLong(1000000));
            basePointDto.setSheet("L-37-" + random.nextInt(144));
            basePointDto.setAccuracyClass(random.nextInt(4) + "кл");
            basePointDto.setCoordinateSystem(String.valueOf(random.nextInt(10000)));
            expectBasePointDtoList.add(basePointDto);
        }

        List<BasePoint> actualBasePointList = basePointMapper.toListBasePoint(expectBasePointDtoList);

        Assertions.assertNotNull(actualBasePointList);
        Assertions.assertEquals(expectBasePointDtoList.size(), actualBasePointList.size());
        for (int i = 0; i < expectBasePointDtoList.size(); i++) {
            Assertions.assertEquals(expectBasePointDtoList.get(i).getName(), actualBasePointList.get(i).getName());
            Assertions.assertEquals(expectBasePointDtoList.get(i).getX(), actualBasePointList.get(i).getX());
            Assertions.assertEquals(expectBasePointDtoList.get(i).getY(), actualBasePointList.get(i).getY());
            Assertions.assertEquals(expectBasePointDtoList.get(i).getZ(), actualBasePointList.get(i).getZ());
            Assertions.assertEquals(expectBasePointDtoList.get(i).getSheet(), actualBasePointList.get(i).getSheet());
            Assertions.assertEquals(expectBasePointDtoList.get(i).getAccuracyClass(), actualBasePointList.get(i).getAccuracyClass());
            Assertions.assertEquals(expectBasePointDtoList.get(i).getCoordinateSystem(), actualBasePointList.get(i).getCoordinateSystem());
        }

    }
}