package org.sci.temaoop.abstractclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Car {

    private String licensePlate;
    private String manufacturer;
    private String model;
    private int yearOfManufacture;


    public abstract List<String> getDefects();

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture &&
                Objects.equals(licensePlate, car.licensePlate) &&
                Objects.equals(manufacturer, car.manufacturer) &&
                Objects.equals(model, car.model);
    }


}
