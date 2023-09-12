package com.challenge.firstchallenge.services;

import com.challenge.firstchallenge.dtos.CarDTO;
import com.challenge.firstchallenge.models.CarModel;
import com.challenge.firstchallenge.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public boolean saveCarService(CarDTO carDTO) {
       try {
           CarModel carModel = new CarModel(
                   carDTO.getIdChassi(),
                   carDTO.getName(),
                   carDTO.getBrand().name(),
                   carDTO.getColor(),
                   carDTO.getFabricationYear()
           );

           carRepository.save(carModel);
           return true;

       } catch (Exception e) {
           return false;
       }
    }

    public Optional<CarModel> getCarService(long id) {
        return carRepository.findById(id);
    }
}
