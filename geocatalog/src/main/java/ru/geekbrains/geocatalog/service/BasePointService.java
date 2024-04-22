package ru.geekbrains.geocatalog.service;

import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.geocatalog.dto.BasePointDto;
import ru.geekbrains.geocatalog.model.BasePoint;

import java.util.List;

public interface BasePointService {

    /**
     * Gets all base points from database
     * @return list of base points
     */
    List<BasePointDto> getAll();

    /**
     * Gets base point by id
     * @param id long id
     * @return BasePointDto instance
     */
    BasePointDto getById(long id);

    /**
     * Gets base point by name
     * @param name String name
     * @return BasePointDto
     */
    BasePointDto getByName(String name);

    /**
     * Adds new base point to database
     * @param basePointDto BasePointDto instance
     * @return BasePointDto instance
     */
    BasePointDto createBasePoint(BasePointDto basePointDto);

    /**
     * Removes base point from database by id
     * @param id long id
     * @return BasePoint instance
     */
    BasePointDto removeById(long id);

    /**
     * Updates base point by id
     * @param id long id
     * @param basePointDto BasePointDto instance
     * @return BasePointDto instance
     */
    BasePointDto updatePoint(long id, BasePointDto basePointDto);


    }
