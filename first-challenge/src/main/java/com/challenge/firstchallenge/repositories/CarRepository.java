package com.challenge.firstchallenge.repositories;

import com.challenge.firstchallenge.models.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarModel, Long> {
}
