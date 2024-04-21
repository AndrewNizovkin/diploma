package ru.geekbrains.geocatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.geocatalog.model.BasePoint;

import java.util.Optional;

public interface BasePointRepository extends JpaRepository<BasePoint, Long> {
    Optional<BasePoint> findByName(String name);
}
