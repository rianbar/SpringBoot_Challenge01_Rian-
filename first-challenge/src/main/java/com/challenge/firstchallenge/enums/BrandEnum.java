package com.challenge.firstchallenge.enums;

public enum BrandEnum {
    Ford("Ford"),
    Chevrolet("Chevrolet"),
    BMW("BMW"),
    Volvo("Volvo");

    final String brand;
    BrandEnum(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return this.brand;
    }
}
