package com.challenge.firstchallenge.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cars")
public class CarModel {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long chassiId;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String fabricationYear;

    protected CarModel() {
        //for Jpa and Hibernate
    }

    public CarModel(String model, String brand, String color, String fabricationYear) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.fabricationYear = fabricationYear;
    }

    public Long getChassiId() {
        return chassiId;
    }

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
