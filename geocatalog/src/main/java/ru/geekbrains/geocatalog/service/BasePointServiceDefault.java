package ru.geekbrains.geocatalog.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
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
public class BasePointServiceDefault implements BasePointService{
    private static final String NOT_FOUND_POINT_MESSAGE = "Couldn't find the point with the ";

    private final BasePointRepository basePointRepository;

    @EventListener(ContextRefreshedEvent.class)
    public void onCreatedDatabase() {
        basePointRepository.save(new BasePoint(
                "Ранний",
                5301079050L,
                75899429790L,
                216820,
                "L-37-09",
                "2кл",
                "1942г"
                ));
        basePointRepository.save(new BasePoint(
                "Горная",
                5297978400L,
                7589821610L,
                210780L,
                "L-37-09",
                "3кл",
                "1942г"
        ));
        basePointRepository.save(new BasePoint(
                "Шахта19",
                5295754480L,
                7586770570L,
                149900L,
                "L-37-09",
                "3кл",
                "1942г"
        ));
        basePointRepository.save(new BasePoint(
                "Шведов",
                409210786L,
                2195989526L,
                17480L,
                "L-37-32",
                "4кл",
                "МСК-61-2"
        ));
        basePointRepository.save(new BasePoint(
                "3102",
                426751170L,
                2216794713L,
                81005L,
                "1р",
                "L-37-32",
                "МСК-61-2"
        ));
        basePointRepository.save(new BasePoint(
                "2901",
                476238734L,
                2244754037L,
                78127L,
                "L-37-32",
                "2р",
                "МСК-61-2"
        ));

    }

    /**
     * Gets all base points from database
     * @return list of base points
     */
    @Override
    public List<BasePointDto> getAll() {
        return BasePointMapper.toListBasePointDto(basePointRepository.findAll());
    }

    /**
     * Gets base point by id
     * @param id long id
     * @return BasePointDto instance
     */
    @Override
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
    @Override
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
    @Override
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
    @Override
    @Transactional
    public BasePointDto removeById(long id) {
        BasePoint basePoint = basePointRepository.findById(id).orElse(null);
        if (basePoint == null) {
            throw new NoSuchElementException(NOT_FOUND_POINT_MESSAGE + "id = " + id);
        }
        basePointRepository.deleteById(id);
        return BasePointMapper.toBasePointDto(basePoint);
    }


    @Override
    @Transactional
    public BasePointDto updatePoint(long id, BasePointDto basePointDto) {
        BasePoint basePoint = basePointRepository.findById(id).orElse(null);
        if (basePoint == null) {
            throw new NoSuchElementException(NOT_FOUND_POINT_MESSAGE + "id = " + id);
        }
        basePoint.setName(basePointDto.getName());
        basePoint.setX(basePointDto.getX());
        basePoint.setY(basePointDto.getY());
        basePoint.setZ(basePointDto.getZ());
        basePoint.setSheet(basePointDto.getSheet());
        basePoint.setPointType(basePointDto.getPointType());

        return BasePointMapper.toBasePointDto(basePointRepository.saveAndFlush(basePoint));
    }

}
