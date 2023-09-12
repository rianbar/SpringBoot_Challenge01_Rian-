package com.challenge.firstchallenge.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CarDTO {
    @NotNull
    @NotBlank
    String model;
    @NotNull
    @NotBlank
    String brand;
    @NotNull
    @NotBlank
    String color;
    @NotNull
    @NotBlank
    String fabricationYear;

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getFabricationYear() {
        return fabricationYear;
    }
}
