package com.challenge.firstchallenge.dtos;

import com.challenge.firstchallenge.enums.BrandEnum;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CarDTO {
    @NotNull
    Long idChassi;
    @NotNull
    String name;
    @NotNull
    BrandEnum brand;
    @NotNull
    String color;
    @NotNull
    String fabricationYear;

    public Long getIdChassi() {
        return idChassi;
    }

    public String getName() {
        return name;
    }

    public BrandEnum getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getFabricationYear() {
        return fabricationYear;
    }
}
