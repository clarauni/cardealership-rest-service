package com.cardealership.carrestservice.repository;

import com.cardealership.carrestservice.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByDealershipId (Long dealershipId);
}
