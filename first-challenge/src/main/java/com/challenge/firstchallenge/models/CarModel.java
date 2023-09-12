package com.challenge.firstchallenge.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cars")
public class CarModel {

    @Id
    @Column(unique = true, nullable = false)
    private Long idChassi;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String fabricationYear;

    public CarModel(Long id, String name, String brand, String color, String fabricationYear) {
        this.idChassi = id;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.fabricationYear = fabricationYear;
    }

    public Long getIdChassi() {
        return idChassi;
    }

    public String getName() {
        return name;
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
