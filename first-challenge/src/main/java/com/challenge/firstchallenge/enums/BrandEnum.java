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

    public static boolean findBrand(String brand) {
        for(BrandEnum brandEnum: values()) {
            if (brandEnum.name().equals(brand)) {
                return true;
            }
        }
        return false;
    }
}
