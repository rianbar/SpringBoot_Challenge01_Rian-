package com.challenge.firstchallenge.enums;

public enum BrandEnum {
    FORD("Ford"),
    CHEVROLET("Chevrolet"),
    BMW("BMW"),
    VOLVO("Volvo");

    final String brand;
    BrandEnum(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return this.brand;
    }
}
