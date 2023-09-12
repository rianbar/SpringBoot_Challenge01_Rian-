package com.challenge.firstchallenge.controllers;

import com.challenge.firstchallenge.dtos.CarDTO;
import com.challenge.firstchallenge.enums.BrandEnum;
import com.challenge.firstchallenge.models.CarModel;
import com.challenge.firstchallenge.services.CarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CarControllers {

    private static final String NOT_FOUND = "Data Not Found";

    private final CarService carService;

    @Autowired
    CarControllers(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/cars")
    public ResponseEntity<Object> saveCars(@RequestBody @Valid CarDTO carDTO) {
        boolean checkIfBrandExists = BrandEnum.findBrand(carDTO.getBrand());

        if (!checkIfBrandExists) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(NOT_FOUND);
        }

        boolean response = carService.saveCarService(carDTO);
        if (response)  {
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Data");
        }
    }

    @GetMapping("/cars/{chassiId}")
    public ResponseEntity<Object> getCar(@PathVariable(name = "chassiId") Long id) {

        Optional<CarModel> carModel = carService.getCarService(id);

        if (carModel.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(carModel);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(NOT_FOUND);
        }
    }
}
