package com.challenge.firstchallenge.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class CarDTO {

    @NotNull(message = "model cannot be null")
    @NotBlank(message = "model cannot be empty")
    String model;
    @NotNull(message = "brand cannot be null")
    @NotBlank(message = "brand cannot be empty")
    String brand;
    @NotNull(message = "color cannot be null")
    @NotBlank(message = "color cannot be empty")
    String color;
    @NotNull(message = "year cannot be null")
    @NotBlank(message = "year cannot be empty")
    @Pattern(regexp = "([0-9]{4})/([0-9]{4})", message = "invalid year")
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
