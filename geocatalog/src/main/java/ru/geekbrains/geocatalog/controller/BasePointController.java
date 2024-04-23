package ru.geekbrains.geocatalog.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ru.geekbrains.geocatalog.dto.BasePointDto;
import ru.geekbrains.geocatalog.service.BasePointService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("point")
@RequiredArgsConstructor
public class BasePointController {

    private final BasePointService basePointService;

    /**
     * Gets all base points from database
     * @return base points list
     */
    @GetMapping
    public ResponseEntity<List<BasePointDto>> getAllBasePoints() {
        return ResponseEntity.ok().body(basePointService.getAll());
    }

    /**
     * Gets base point by id
     * @param id point id
     * @return BasePointDto instance
     */
    @GetMapping("{id}")
    public ResponseEntity<BasePointDto> getBasePointById(@PathVariable long id) {
        try {
            return ResponseEntity.ok().body(basePointService.getById(id));
        } catch (NoSuchElementException e) {
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    /**
     * Gets base point by name
     * @param name The name of the desired point
     * @return BasePointDto instance
     */
    @GetMapping("name/{name}")
    public ResponseEntity<List<BasePointDto>> getBasePointByName(@PathVariable String name) {
        try {
            return ResponseEntity.ok().body(basePointService.getByName(name));
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    /**
     * Removes base point by id
     * @param id point id
     * @return Removed base point
     */
    @DeleteMapping("{id}")
    public ResponseEntity<BasePointDto> removeBasePointById(@PathVariable long id) {
        try {
            return ResponseEntity.ok().body(basePointService.removeById(id));
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    /**
     * Creates a new base point and adds it to the database
     * @param basePointDto BasePointDto instance
     * @return BasePointDto instance
     */
    @PostMapping
    public ResponseEntity<BasePointDto> createBasePoint(@RequestBody BasePointDto basePointDto) {
        return new ResponseEntity<>(basePointService.createBasePoint(basePointDto),HttpStatus.CREATED);
    }

    /**
     * Updates base point with desired id
     * @param id desired id
     * @param basePointDto BasePointDto instance
     * @return BasePointDto instance
     */
    @PutMapping("{id}")
    public ResponseEntity<BasePointDto> updateBasePoint(@PathVariable long id, @RequestBody BasePointDto basePointDto) {
        try {
            return ResponseEntity.ok().body(basePointService.updatePoint(id, basePointDto));
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

}
