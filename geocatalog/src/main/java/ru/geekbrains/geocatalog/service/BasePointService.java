package ru.geekbrains.geocatalog.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.geocatalog.dto.BasePointDto;
import ru.geekbrains.geocatalog.mapper.BasePointMapper;
import ru.geekbrains.geocatalog.model.BasePoint;
import ru.geekbrains.geocatalog.repository.BasePointRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class BasePointService {
    private static final String NOT_FOUND_POINT_MESSAGE = "Couldn't find the point with the ";

    private final BasePointRepository basePointRepository;

    /**
     * Gets all base points from database
     * @return list of base points
     */
    public List<BasePoint> getAll() {
        return basePointRepository.findAll();
    }

    /**
     * Gets base point by id
     * @param id long id
     * @return BasePointDto instance
     */
    public BasePointDto getById(long id) {
        BasePoint basePoint = basePointRepository.findById(id).orElse(null);
        if (basePoint != null) {
            return BasePointMapper.toBasePointDto(basePoint);
        } else {
            throw new NoSuchElementException(NOT_FOUND_POINT_MESSAGE + "id = " + id);
        }
    }

    /**
     * Gets base point by name
     * @param name String name
     * @return BasePointDto
     */
    public BasePointDto getByName(String name) {
        BasePoint basePoint = basePointRepository.findByName(name).orElse(null);
        if (basePoint == null) {
            throw new NoSuchElementException(NOT_FOUND_POINT_MESSAGE + "name = " + name);
        }
        return BasePointMapper.toBasePointDto(basePoint);
    }

    /**
     * Adds new base point to database
     * @param basePointDto BasePointDto instance
     * @return BasePointDto instance
     */
    @Transactional
    public BasePointDto createBasePoint(BasePointDto basePointDto) {
        BasePoint basePoint = BasePointMapper.toBasePoint(basePointDto);
        return BasePointMapper.toBasePointDto(basePointRepository.saveAndFlush(basePoint));
    }

    /**
     * Removes base point from database by id
     * @param id long id
     * @return BasePoint instance
     */
    @Transactional
    public BasePointDto removeById(long id) {
        BasePoint basePoint = basePointRepository.findById(id).orElse(null);
        if (basePoint == null) {
            throw new NoSuchElementException(NOT_FOUND_POINT_MESSAGE + "id = " + id);
        }
        basePointRepository.deleteById(id);
        return BasePointMapper.toBasePointDto(basePoint);
    }

}
